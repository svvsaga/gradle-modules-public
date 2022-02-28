package no.vegvesen.saga.modules.shared

import org.buildobjects.process.ProcBuilder
import org.buildobjects.process.ProcResult
import java.io.File

fun execute(commandWithArgs: String, workingDir: String): ProcResult =
    defaultProcBuilder(commandWithArgs)
        .withWorkingDirectory(File(workingDir))
        .run()

fun defaultProcBuilder(commandWithArgs: String): ProcBuilder {
    val (command, args) = toCommandAndArgs(commandWithArgs)

    return ProcBuilder(command)
        .withNoTimeout()
        .withArgs(*args)
        .withErrorStream(System.out) // SLF4J prints all log statements to stderr (e.g. in dataflow job)
        .withOutputStream(System.out)
}

fun toCommandAndArgs(commandWithArgs: String): Pair<String, Array<String>> {
    val parts = commandWithArgs.split(" ")
    return Pair(parts.first(), parts.takeLast(parts.size - 1).toTypedArray())
}