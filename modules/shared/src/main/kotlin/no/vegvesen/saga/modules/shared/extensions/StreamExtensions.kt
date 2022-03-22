package no.vegvesen.saga.modules.shared.extensions

import java.io.BufferedInputStream
import java.io.InputStream

fun InputStream.bufferAndPeek(bytesToPeek: Int = 1024): Pair<BufferedInputStream, ByteArray> {
    val buffered = BufferedInputStream(this)
    buffered.mark(bytesToPeek)
    val firstBytes = buffered.readNBytes(bytesToPeek)
    buffered.reset()
    return buffered to firstBytes
}
