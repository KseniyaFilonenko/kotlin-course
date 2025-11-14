package org.example.lessons.lesson19.homeworks

class StringValidator: Validator<String?> {
    override fun validate(value: String?): Boolean {
        return !value.isNullOrBlank()
    }
}