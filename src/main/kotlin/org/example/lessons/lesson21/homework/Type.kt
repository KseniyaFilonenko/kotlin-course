package org.example.lessons.lesson21.homework

// 1
fun analyzeDataType(value: Any) {
    if (value is String) {
        println("Это строка: $value")
    } else if (value is Number) {
        println("Это число: $value")
    } else if (value is List<*>) {
        println("Это список, количество элементов: ${value.size}")
    } else if (value is Map<*, *>) {
        println("Это словарь, количество пар: ${value.size}")
    } else {
        println("Неизвестный тип данных")
    }
}

// 2
fun safeCastToList(value: Any): Int {
    val list = value as? List<*>
    return list?.size ?: -1
}

// 3
fun getStringLengthOrZero(value: Any?): Int {
    val str = value as? String
    return str?.length ?: 0
}

// 4
fun Any.toSquare(): Double {
    return if (this is Number) {
        this.toDouble() * this.toDouble()
    } else if (this is String) {
        val num = this.toDoubleOrNull()
        if (num != null) num * num else 0.0
    } else {
        0.0
    }
}

// 5
fun sumIntOrDoubleValues(list: List<Any>): Double {
    var sum = 0.0

    for (item in list) {
        if (item is Int) {
            sum += item
        } else if (item is Double) {
            sum += item
        }
    }
    return sum
}

// 6
fun tryCastToListAndPrint(arg: Any) {
    val result = (arg as? List<*>)?.map { (it as? String) ?: "Элемент не является строкой" }
        ?: "Не удалось преобразовать аргумент в список"
    println(result)
}

fun main() {
    analyzeDataType("Привет")
    analyzeDataType(123)
    analyzeDataType(listOf("a", "b", "c"))
    analyzeDataType(mapOf(1 to "x"))
    analyzeDataType(true)

    println(safeCastToList(listOf(1, 2, 3)))
    println(safeCastToList("hello"))

    println(getStringLengthOrZero("Привет"))
    println(getStringLengthOrZero(123))

    println(5.toSquare())
    println("abc".toSquare())

    val data = listOf(1, 2.5, "hello", 7, true, 3.3)
    println(sumIntOrDoubleValues(data))

    tryCastToListAndPrint(listOf("Hello", "Kotlin", 123, true))
    tryCastToListAndPrint(42)
}