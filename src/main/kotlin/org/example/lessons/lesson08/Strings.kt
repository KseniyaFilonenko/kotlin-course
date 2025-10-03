package org.example.lessons.lesson08

fun mainn() {
    val originalString = "Kptlin is fun"
    val subString = originalString.substring(7) // "is fun"
    val subString2 = originalString.substring(3,6) // "lin"
    val replacedString = originalString.replace("fun", "good")
    val split = originalString.split(" ")
    val upper = "hello".uppercase()
    val lower = "HELLO".lowercase()
    val trimmed = " hello ".trim() // "hello"
    val starts = "Kotlin".startsWith("Kot") // true
    val ends = "Kotlin".endsWith("lin") // true
    val repeat = "ab".repeat(3) // "ababab"
    val multiStrings = """
        first string
        second
        third
        """.trimIndent()
}
fun main () {
    ex("Ошибка в системе вызвала панику")
    ex("Для завершения проекта важно")
}

fun ex(arg: String) {
    val result = when {
        arg.startsWith("Ошибка") -> arg.replace("Ошибка", "небольшое недоразумение")
        arg.endsWith("Важно", true) -> "$arg ... но не критично"
        else -> arg
    }
    println(result)
}