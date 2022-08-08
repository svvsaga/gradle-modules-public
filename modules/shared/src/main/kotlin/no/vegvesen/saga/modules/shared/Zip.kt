package no.vegvesen.saga.modules.shared

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.util.zip.GZIPInputStream
import java.util.zip.GZIPOutputStream

fun gzipCompress(content: ByteArray): ByteArray =
    ByteArrayOutputStream().use { bos ->
        GZIPOutputStream(bos).use { gzip ->
            gzip.write(content)
        }
        bos.toByteArray()
    }

fun gzipDecompress(gzippedContent: ByteArray): ByteArray =
    ByteArrayInputStream(gzippedContent).use { bis ->
        GZIPInputStream(bis).use { gzip ->
            gzip.readBytes()
        }
    }
