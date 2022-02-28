package no.vegvesen.saga.modules.shared

fun <T> List<T>.second(): T {
    if (size < 2)
        throw NoSuchElementException("List does not have a second element.")
    return get(1)
}

fun <T> List<T>.third(): T {
    if (size < 3)
        throw NoSuchElementException("List does not have a third element.")
    return get(2)
}
