package org.example.lessons.lesson09.homeworks

fun main() {

//Работа с массивами Array
//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val a1: Array<Int> = arrayOf(1, 2, 3, 4, 5)
//Создайте пустой массив строк размером 10 элементов.
    val a2: Array<Int> = Array(10) { 0 }
//Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val a3: Array<Double> = Array(5) { i -> (i * 2).toDouble() }
//Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    val a4: Array<Int> = Array(5) { 0 }
    for (i in a4.indices) {
        a4[i] = i * 3
    }
//Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val a5 = arrayOfNulls<Any>(5)
    a5[0] = null
    a5[1] = "sss"
    a5[2] = "ggg"
//Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val a6: Array<Int> = arrayOf(1, 2, 3, 4)
    val a7 = arrayOfNulls<Int>(4)
    for (i in a6.indices) {
        a7[i] = a6[i]
    }
//Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.
    val a8: Array<Int> = arrayOf(1, 2, 3, 4)
    val a9: Array<Int> = arrayOf(1, 2, 3, 4)
    val a10 = arrayOfNulls<Int>(4)
    for (i in a10.indices) {
        a10[i] = a9[i] - a8[i]
    }
//Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.
    val a11: Array<Int> = arrayOf(1, 3, 5, 10)
    var i = 0
    var y = -1
    while (i < a11.size) {
        if (a11[i] == 5) {
            y = i
            break
        }
        i++
    }
    println(y)
//Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого
// элемента должно быть написано “чётное” или “нечётное”.
    val a12: Array<Int> = arrayOf(2, 4, 5, 7, 8)
    for (i in a12.indices) {
        val number = a12[i]
        if (i % 2 == 0) {
            println("$number - чётное")
        } else {
            println("$number - нечётное")
        }
    }
    //Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором
// принятая строка является подстрокой (метод contains()). Верни найденный элемент из функции в виде строки.
    fun aa(arr: Array<String>, search: String): String? {
        for (element in arr) {
            if (element.contains(search)) {
                return element
            }
        }
        return null
    }


//Работа со списками List
//Создайте пустой неизменяемый список целых чисел.
    val b1: List<Int> = List(10) { 0 }
//Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val b2: List<String> = listOf("Hello", "World", "Kotlin")
//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val b3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    val b4: MutableList<Int> = mutableListOf()
    b4.add(0, 6)
    b4.add(1, 7)
    b4.add(2, 8)
//Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val b5: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    b5.remove("World")
//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val b6: List<Int> = listOf(1, 2, 3, 4)
    for (i in b6) {
        println(i)
    }
//Создайте список строк и получите из него второй элемент, используя его индекс.
    val b7: List<String> = listOf("Hello", "World", "Kotlin")
    val secondElement = b7[1]
    println(secondElement)
//Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент на позиции 2 на новое значение).
    val b8: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    b8[2] = 9
//Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val b9 = listOf("asd", "kk", "bbh")
    val b10 = listOf("ee", "dd")
    val b11: MutableList<String> = mutableListOf()
    for (num in b9) {
        b11.add(num)
    }
    for (num in b10) {
        b11.add(num)
    }
//Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val b12 = listOf(1, 2, 18, 13, 11)
    var min = b12[0]
    var max = b12[0]
    for (num in b12) {
        if (num < min) {
            min = num
        }
        if (num > max) {
            max = num
        }
    }
//Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val b13 = listOf(1, 2, 18, 13, 11)
    val b14: MutableList<Int> = mutableListOf()
    for (num in b13) {
        if (num % 2 == 0) {
            b14.add(num)
        }
    }


//Работа с Множествами Set
//Создайте пустое неизменяемое множество целых чисел.
    val c1: Set<Int> = setOf()
//Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val c2: Set<Int> = setOf(1, 2, 3)
//Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    val c3: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
//Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    val c4: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
    c4.add("Swift")
    c4.add("Go")
//Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val c5: MutableSet<Int> = mutableSetOf(1, 2, 3)
    c5.remove(2)
//Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    val c6: Set<Int> = setOf(1, 2, 3)
    for (i in c6) {
        println(i)
    }
//Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
//Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
    fun c7(setttt: Set<String>, string: String): Boolean {
        for (element in setttt) {
            if (element.contains(string)) {
                return true
            }
        }
        return false
    }
//Создайте множество строк и конвертируйте его в список с использованием цикла.
    val c8: Set<String> = setOf("cc", "bb", "ll")
    val c9: MutableList<String> = mutableListOf()
    for (i in c8) {
        c9.add(i)
    }
}