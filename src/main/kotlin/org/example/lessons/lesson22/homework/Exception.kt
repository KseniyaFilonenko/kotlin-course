package org.example.lessons.lesson22.homework


fun main() {
    // NullPointerException
    try {
        null!!
    } catch (e: NullPointerException) {
        println("NullPointerException")
    }

    // IndexOutOfBoundsException
    try {
        val list = listOf(1, 2, 3)
        list[10]
    } catch (e: IndexOutOfBoundsException) {
        println("IndexOutOfBoundsException")
    }

    // ClassCastException
    try {
        val x: Any = 10
        x as String
    } catch (e: ClassCastException) {
        println("ClassCastException")
    }

    // IllegalArgumentException
    try {
        require(false)
    } catch (e: IllegalArgumentException) {
        println("IllegalArgumentException")
    }

    // NumberFormatException
    try {
        "hello".toInt()
    } catch (e: NumberFormatException) {
        println("NumberFormatException")
    }

    // IllegalStateException
    try {
        check(false) { "Illegal state" }
    } catch (e: IllegalStateException) {
        println("IllegalStateException")
    }

    // OutOfMemoryError
    try {
        val big = IntArray(Int.MAX_VALUE)
    } catch (e: OutOfMemoryError) {
        println("OutOfMemoryError")
    }

    // StackOverflowError
    try {
        fun boom(): Int = boom() + 1
        boom()
    } catch (e: StackOverflowError) {
        println("StackOverflowError")
    }

    // 10
    fun processAndDetectExceptions(arg: Any?) {
        try {
            // 1 NullPointerException — произойдёт, если arg == null
            val nonNull = arg!!

            // 2 IndexOutOfBoundsException — попробуем взять элемент с большого индекса из списка
            // Если nonNull не список, используем пустой список -> доступ к элементу вызовет IndexOutOfBoundsException
            val list = nonNull as? List<Any> ?: emptyList()
            val ignored = list[100]

            // 3 ClassCastException — принудительное приведение к неподходящему типу
            val forcedString: String = nonNull as String

            // 4 IllegalArgumentException — проверка аргумента через require
            // Например, требуем, чтобы строка не была пустой
            require(forcedString.isNotEmpty())

            // 5 NumberFormatException — преобразование строки в число
            // Если строка не число => toInt() бросит NumberFormatException
            val number = forcedString.toInt()

            // 6 IllegalStateException — проверка состояния
            check(number >= 0)

            // Если дошли сюда — исключений не было
            println("Переданный аргумент фантастически хорош!")

        } catch (t: Throwable) {
            when (t) {
                is NullPointerException -> println("NullPointerException")
                is IndexOutOfBoundsException -> println("IndexOutOfBoundsException")
                is ClassCastException -> println("ClassCastException")
                is IllegalArgumentException -> println("IllegalArgumentException")
                is NumberFormatException -> println("NumberFormatException")
                is IllegalStateException -> println("IllegalStateException")
                else -> println("Другое исключение")
            }
            throw t
        }
    }

}