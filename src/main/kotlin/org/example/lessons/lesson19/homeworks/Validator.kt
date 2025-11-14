package org.example.lessons.lesson19.homeworks

// 6
interface Validator<T> {
    fun validate(value: T): Boolean
}