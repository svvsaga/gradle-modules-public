package no.vegvesen.saga.modules.beam

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking
import org.apache.beam.sdk.coders.NullableCoder
import org.apache.beam.sdk.io.Compression
import org.apache.beam.sdk.io.FileIO
import org.apache.beam.sdk.io.fs.EmptyMatchTreatment
import org.apache.beam.sdk.transforms.Count
import org.apache.beam.sdk.transforms.DoFn
import org.apache.beam.sdk.transforms.Filter
import org.apache.beam.sdk.transforms.FlatMapElements
import org.apache.beam.sdk.transforms.GroupByKey
import org.apache.beam.sdk.transforms.MapElements
import org.apache.beam.sdk.transforms.ParDo
import org.apache.beam.sdk.transforms.ProcessFunction
import org.apache.beam.sdk.transforms.SerializableFunction
import org.apache.beam.sdk.values.KV
import org.apache.beam.sdk.values.PCollection
import org.apache.beam.sdk.values.TupleTag
import org.apache.beam.sdk.values.TupleTagList
import org.apache.beam.sdk.values.TypeDescriptor
import org.apache.beam.sdk.values.TypeDescriptors
import java.util.stream.Stream

/**
 * Inspired by blog article https://blog.papercut.com/apache-beam-in-kotlin-to-reduce-the-boilerplate-code/
 */

inline fun <I, reified O> PCollection<I>.parFlatMap(
    name: String? = null,
    noinline transform: (I) -> Iterable<O>,
): PCollection<O> =
    this.apply(
        name ?: "FlatMap to ${O::class.simpleName}",
        FlatMapElements.into(TypeDescriptor.of(O::class.java))
            .via(SerializableFunction(transform)),
    ).let {
        it.setCoder(NullableCoder.of(it.coder))
    }

inline fun <reified O, I : Iterable<O>> PCollection<I>.parFlatten(name: String? = null): PCollection<O> =
    this.parFlatMap(
        name
            ?: "Flatten to ${O::class.simpleName}",
    ) { it }

inline fun <I, reified O> PCollection<I>.parFlatMapStreaming(
    name: String? = null,
    noinline transform: (I) -> Stream<O>,
): PCollection<O> =
    this.apply(
        name ?: "FlatMap to ${O::class.simpleName} stream",
        ParDo.of(
            object : DoFn<I, O>() {
                @ProcessElement
                fun processElement(@Element input: I, output: OutputReceiver<O>) {
                    transform(input).forEach(output::output)
                }
            },
        ),
    ).let {
        it.setCoder(NullableCoder.of(it.coder))
    }

inline fun <I, reified O> PCollection<I>.parFlatMapFlowing(
    name: String? = null,
    noinline transform: (I) -> Flow<O>,
): PCollection<O> =
    this.apply(
        name ?: "FlatMap to ${O::class.simpleName} flow",
        ParDo.of(
            object : DoFn<I, O>() {
                @ProcessElement
                fun processElement(@Element input: I, output: OutputReceiver<O>) = runBlocking {
                    transform(input).onEach(output::output).collect()
                }
            },
        ),
    ).let {
        it.setCoder(NullableCoder.of(it.coder))
    }

inline fun <I, reified O> PCollection<I>.parMap(
    name: String?,
    typeDescriptor: TypeDescriptor<O>,
    noinline transform: (I) -> O,
): PCollection<O> = this.apply(
    name ?: "Map to ${O::class.simpleName}",
    MapElements.into(typeDescriptor)
        .via(SerializableFunction(transform)),
).let { it.setCoder(NullableCoder.of(it.coder)) }

inline fun <I, reified O> PCollection<I>.parMap(
    name: String? = null,
    noinline transform: (I) -> O,
): PCollection<O> =
    parMap<I, O>(name, TypeDescriptor.of(O::class.java), transform)

inline fun <I, reified O> PCollection<I>.parMapList(
    name: String? = null,
    noinline transform: (I) -> List<O>,
): PCollection<List<O>> =
    parMap<I, List<O>>(name, TypeDescriptors.lists(TypeDescriptor.of(O::class.java)), transform)

fun <TIn> PCollection<TIn>.filter(
    name: String,
    filterFn: (TIn) -> Boolean,
): PCollection<TIn> {
    return apply(name, Filter.by(ProcessFunction(filterFn)))
}

fun <TIn> PCollection<TIn>.countPerElement(
    name: String? = null,
): PCollection<KV<TIn, Long>> {
    return this.apply(
        name ?: "count per element",
        Count.perElement<TIn>(),
    )
        .setTypeDescriptor(object : TypeDescriptor<KV<TIn, Long>>() {})
}

// We get Coder error with Beam without "inline" here...
@Suppress("NOTHING_TO_INLINE")
inline fun <T, K> PCollection<T>.keyBy(name: String? = null, noinline f: (T) -> K): PCollection<KV<K, T>> {
    return this.apply(
        name ?: "keyBy(${f::class.java})",
        ParDo.of(
            object : DoFn<T, KV<K, T>>() {
                @ProcessElement
                fun processElement(context: ProcessContext) {
                    val element = context.element()
                    context.output(KV.of(f(element), element))
                }
            },
        ),
    )
}

inline fun <reified K, reified V> PCollection<KV<K, V>>.groupByKey(name: String?): PCollection<KV<K, Iterable<V>>> =
    this.apply("groupByKey" + name?.let { ": $it" }, GroupByKey.create())

inline fun <reified T, reified K> PCollection<T>.groupBy(
    name: String?,
    noinline f: (T) -> K,
): PCollection<KV<K, Iterable<T>>> =
    this.keyBy("groupBy" + name?.let { ": $it" }, f).groupByKey(name)

fun PCollection<String>.matchAndReadFiles(
    emptyMatchTreatment: EmptyMatchTreatment = EmptyMatchTreatment.ALLOW_IF_WILDCARD,
    compression: Compression = Compression.AUTO,
): PCollection<FileIO.ReadableFile> {
    return apply(
        "Find files in bucket",
        FileIO.matchAll().withEmptyMatchTreatment(emptyMatchTreatment),
    ).apply("Read files from bucket", FileIO.readMatches().withCompression(compression))
}

inline fun <I, reified O1, reified O2> PCollection<I>.parFlatSplitInto(
    name: String?,
    crossinline fn: (I) -> Pair<Iterable<O1>, Iterable<O2>>,
):
    Pair<PCollection<O1>, PCollection<O2>> {
    val tag1 = object : TupleTag<O1>() {}
    val tag2 = object : TupleTag<O2>() {}

    return apply(
        name ?: "Split",
        ParDo.of(
            object : DoFn<I, O1>() {
                @ProcessElement
                fun processElement(context: ProcessContext) {
                    val pair = fn(context.element())

                    pair.first.forEach { context.output(tag1, it) }
                    pair.second.forEach { context.output(tag2, it) }
                }
            },
        ).withOutputTags(tag1, TupleTagList.of(tag2)),
    ).let { it.get(tag1) to it.get(tag2) }
}

inline fun <I, reified O1, reified O2> PCollection<I>.splitInto(name: String?, crossinline fn: (I) -> Pair<O1, O2>):
    Pair<PCollection<O1>, PCollection<O2>> = this.parFlatSplitInto(name) {
    fn(it).let { pair ->
        Pair(listOf(pair.first), listOf(pair.second))
    }
}
