package org.example.lessons.lesson19.homeworks

// 8
class OddValidator: Validator<Int> {
    override fun validate(value: Int): Boolean {
        return value % 2 == 0
    }
}