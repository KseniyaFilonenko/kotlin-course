package org.example.lessons.lesson23.homeworks


// 1
fun fun1(list: List<Int>): Double {
    require(list.isNotEmpty())
    val evens = list.filter { it % 2 == 0 }
    return if (evens.isEmpty()) 0.0 else evens.average()
}

val a = fun(list: List<Int>): Double {
    require(list.isNotEmpty())
    val evens = list.filter { it % 2 == 0 }
    return if (evens.isEmpty()) 0.0 else evens.average()
}

val b: (list: List<Int>) -> Double = { list ->
    require(list.isNotEmpty())
    val evens = list.filter { it % 2 == 0 }
    if (evens.isEmpty()) 0.0 else evens.average()
}

val c = {list: List<Int> ->
    require(list.isNotEmpty())
    val evens = list.filter { it % 2 == 0 }
    if (evens.isEmpty()) 0.0 else evens.average()
}

// 2
fun sumDigits(number: Long): Int {
    require(number > 0)
    return number
        .toString()
        .sumOf { it.digitToInt() }
}

val a1 = fun(number: Long): Int {
    require(number > 0)
    return number.toString().sumOf { it.digitToInt() }
}

val b1: (Long) -> Int = { number ->
    require(number > 0)
    number.toString().sumOf { it.digitToInt() }
}

val c1 = { number: Long ->
    require(number > 0)
    number.toString().sumOf { it.digitToInt() }
}

// 3
fun List<Number>.a2(): Set<Number> {
    return this
        .groupingBy { it }
        .eachCount()
        .filter { it.value > 1 }
        .keys
}

val b2 = fun(list: List<Number>): Set<Number> {
    return list
        .groupingBy { it }
        .eachCount()
        .filter { it.value > 1 }
        .keys
}

val c2: (List<Number>) -> Set<Number> = { list ->
    list
        .groupingBy { it }
        .eachCount()
        .filter { it.value > 1 }
        .keys
}


fun main() {
    // 1
    val data1 = listOf(1, 2, 3, 4, 5, 6)
    val data2 = listOf(1, 3, 5)
    val data3 = listOf(2, 4, 6, 8)

    println(fun1(data1))
    println(fun1(data2))
    println(fun1(data3))
    println(a(data1))
    println(b(data2))
    println(c(data3))

    // 2
    println(sumDigits(123456))
    println(a1(987654321))
    println(b1(1111111111111))
    println(c1(2025))

    // 3
    val list1 = listOf(1, 2, 3, 1, 2, 4)
    val list2 = listOf(10, 10, 10, 5)
    val list3 = listOf(7, 8, 9)

    println(list1.a2())
    println(b2(list2))
    println(c2(list3))
}
