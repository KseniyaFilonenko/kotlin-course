package org.example.lessons.lesson20.homeworks

import kotlin.math.absoluteValue

// 1
fun <T : Number> Array<T>.firstAndLast(): Pair<T?, T?> {
    return if (isEmpty()) Pair(null, null)
    else Pair(first(), last())
}

// 2
fun <T : Comparable<T>> MutableList<T>.sortedImmutable(ascending: Boolean): List<T> {
    if (ascending) {
        this.sort()
    } else {
        this.sortDescending()
    }
    return this.toList()
}

// 3
fun <K, V> Map<K, List<V>>?.mapByIndex(index: Int): Map<String, V?>? {
    return this
        ?.mapKeys { it.key.toString() }
        ?.mapValues { it.value.getOrNull(index) }
}

// 4
fun Number.within(other: Number, deviation: Number): Boolean {
    val diff = this.toDouble() - other.toDouble()
    return diff.absoluteValue <= deviation.toDouble()
}

fun main() {
    println(10.within(12, 2))
    println(10.within(13, 2))

    println(10.5.within(10.7, 0.3))
    println(10.5.within(10.7, 0.1))

    println(100L.within(95L, 5))
    println(100L.within(90L, 5))

    println(5f.within(5.1f, 0.2f))
    println(5f.within(5.1f, 0.05f))

    val original = "Hello, Kotlin!"
    val base = 3

    val encrypted = original.encrypt(base)
    val decrypted = encrypted.decrypt(base)

    println("Original:  $original")
    println("Encrypted: $encrypted")
    println("Decrypted: $decrypted")
}

// 5
fun String.encrypt(base: Int): String {
    return map { it + base }.joinToString("")
}
fun String.decrypt(base: Int): String {
    return map { it - base }.joinToString("")
}

// 6
fun String.twitterize(authors: List<String>) {
    var counter = 0
    for (l in this) {
        println(authors[counter++])
        println(l.uppercase())
        println()
        if (counter >= authors.size) {
            counter = 0
        }
    }
}