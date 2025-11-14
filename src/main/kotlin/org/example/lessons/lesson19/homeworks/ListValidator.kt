package org.example.lessons.lesson19.homeworks

// 9
class ListValidator<T : Number> : Validator<List<T?>> {
    override fun validate(value: List<T?>): Boolean {
        if (value.any { it == null }) return false

        return value.all { it!!.toDouble() != 0.0 }
    }
}