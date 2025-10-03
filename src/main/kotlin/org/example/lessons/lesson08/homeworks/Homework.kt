package org.example.lessons.lesson08.homeworks

fun main () {
    ex("Это невозможно выполнить за один день")
    ex("Я не уверен в успехе этого проекта")
    ex("Произошла катастрофа на сервере")
    ex("Этот код работает без проблем")
    ex("Удача")
    ex2("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    ex3()
    ex4()
    ex5("C:/Пользователи/Документы/report.txt")
    ex5("D:/good.themes/dracula.theme")
    ex6()
}

// 1. Преобразование строк
//Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования,
// делая текст более ироничным или забавным. Функция должна уметь распознавать ключевые слова или условия и соответственно изменять фразу.

fun ex(phrase: String) {
    val result = when {
        phrase.contains("невозможно") -> phrase.replace("невозможно", "совершенно точно возможно, просто требует времени")
        phrase.startsWith("Я не уверен", true) -> "$phrase, но моя интуиция говорит об обратном"
        phrase.contains("катастрофа") -> phrase.replace("катастрофа", "интересное событие")
        phrase.endsWith("без проблем") -> phrase.replace("без проблем", "с парой интересных вызовов на пути")
        phrase.trim().split(" ").size == 1 -> "Иногда, $phrase, но не всегда"
        else -> phrase
    }
    println(result)
}

// 2. Извлечение даты из строки лога
//У вас есть строка лога, например "Пользователь вошел в систему -> 2021-12-01 09:48:23" (данные могут быть любыми, но формат всегда такой).
// Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди. Используй indexOf или split для получения правой части сообщения.
fun ex2(log: String) {
    val parts = log.split("->")
    val dateTime = parts[1].trim()
    val date = dateTime.split(" ")[0]
    val time = dateTime.split(" ")[1]

    println(date)
    println(time)
}

// 3. Маскирование личных данных
//Дана строка с номером кредитной карты, например "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех, символами "*".
fun ex3() {
    val card = "4539 1488 0343 6467"
    val cleanSpaces = card.replace(" ", "")
    val last4Digits = cleanSpaces.substring(12)
    val mask = "*".repeat(12)
    val result = mask + last4Digits
    println(result)
}

// 4. Форматирование адреса электронной почты.
//У вас есть электронный адрес, например "username@example.com". Преобразуйте его в строку "username [at] example [dot] com", используя функцию replace()
fun ex4() {
    val email = "username@example.com"
    val result = email.replace("@", "[at]")
        .replace(".", "[dot]")
    println(result)
}

// 5. Извлечение имени файла из пути.
//Дан путь к файлу, например "C:/Пользователи/Документы/report.txt" или "D:/good.themes/dracula.theme" (может быть любым). Извлеките название файла с расширением.
fun ex5(path: String) {
    val name = path.substringAfterLast("/")
    println(name)
}

//6. Создание аббревиатуры из фразы.
//У вас есть фраза, например "Котлин лучший язык программирования" (может быть любой с разделителями слов - пробел).
// Создайте аббревиатуру из начальных букв слов (например, "ООП").
//Используйте split. Используйте for для перебора слов. Используйте var переменную для накопления первых букв.
fun ex6() {
    val phrase = "Котлин лучший язык программирования"
    val words = phrase.split(" ")
    var abb = ""
    for (word in words) {
        abb += word[0].uppercaseChar()
    }
    println(abb)
}