package org.example.lessons.lesson22.homework

class MyCustomException(message: String) : AssertionError(message)

fun main() {
    throw MyCustomException("Моё собственное исключение с сообщением!")
}
