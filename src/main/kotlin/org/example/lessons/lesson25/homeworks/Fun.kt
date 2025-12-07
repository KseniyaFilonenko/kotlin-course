package org.example.lessons.lesson25.homeworks

// 1
fun <T> timeTracker(block: () -> T): Long {
    val start = System.currentTimeMillis()
    block()
    val end = System.currentTimeMillis()
    return end - start
}

fun main() {
    val myFunction = {
        val list = List(10_000_000) { (0..10_000).random() }
        list.sorted()
    }

    val time = timeTracker(myFunction)

    println("Время выполнения: $time мс")
}

// 2
