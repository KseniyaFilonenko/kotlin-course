package org.example.lessons.lesson22.homework

class MyCustomException2(cause: IndexOutOfBoundsException) : RuntimeException(cause)

fun main() {
    try {
        val list = listOf(1, 2, 3)
        println(list[10])
    } catch (ex: IndexOutOfBoundsException) {
        println("Перехвачено исключение IndexOutOfBoundsException")
        throw MyCustomException(ex.toString())
    }
}
