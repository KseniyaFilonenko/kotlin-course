package org.example.lessons.lesson10.homeworks

fun main() {

//Задачи на работу со словарём
//Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val a1 = mapOf<Int, Int>()
//Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val a2: Map<Float, Double> = mapOf(1.11F to 2.3, 3.44F to 1.2)
//Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val a3 = mutableMapOf(1 to "fff", 2 to "nnnn")
//Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    val a4 = mutableMapOf(1 to "ss", 2 to "bb", 3 to "vvv")
    a4[4] = "vvnn"
//Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
    println(a4[3])
    println(a4[7])
//Удалите определенный элемент из изменяемого словаря по его ключу.
    a4.remove(4)
    println(a4)
//Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
// Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val a5 = mapOf(2.2 to 4, 3.1 to 5, 1.5 to 0)
    for ((doubleEl, intEl) in a5) {
        if (intEl == 0) {
            println("бесконечность")
        } else {
            println(doubleEl / intEl)
        }
    }
//Измените значение для существующего ключа в изменяемом словаре.
    a3[1] = "aaaaaaaaaa"
//Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val a6 = mapOf(1 to 2, 2 to 66, 7 to 88)
    val a7 = mapOf(44 to "hvhgvh", 21 to "kkkjhjh")
    val a8 = mutableMapOf<Int, Any>()
    for ((key, value) in a6) {
        a8[key] = value
    }
    for ((key, value) in a7) {
        a8[key] = value
    }
    println(a8)
//Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
    val a9 = mutableMapOf<String, List<Int>>()
    a9["llll"] = listOf(1, 2, 4, 65)
    a9["eeeesss"] = listOf(955, 22)
//Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк.
// Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.
    val a10 = mutableMapOf<Int, MutableSet<String>>()
    a10[111] = mutableSetOf("aa", "bb", "cc")
    a10[22] = mutableSetOf("ee", "uu")
    val element = a10[22]
    element?.add("tyyyyyy") // idea красным нарисовала - replace with safe(?.) call, но я не поняла почему
    println(element)
//Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.
    val a11 = mapOf(
        Pair(1, 2) to 10,
        Pair(5, 3) to 20,
        Pair(4, 5) to 30,
        Pair(7, 8) to 40
    )
    for ((key, value) in a11) {
        if (key.first == 5 || key.second == 5) {
            println(value)
        }
    }

//Задачи на подбор оптимального типа для словаря
//Словарь библиотека: Ключи - автор книги, значения - список книг
    val a12 = mutableMapOf(
        "author1" to mutableListOf("aa", "bb"),
        "author2" to mutableListOf("ee", "rr", "gg")
    )
//Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val a13 = mutableMapOf(
        "Цветы" to mutableListOf("aaa", "ff", "gg"),
        "Деревья" to mutableListOf("xx", "vv")
    )
//Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val a14 = mutableMapOf(
        "t1" to mutableListOf("p1", "p2", "p3"),
        "t2" to mutableListOf("p4", "p5"),
        "t3" to mutableListOf("p6", "p7", "p8"),
        "t4" to mutableListOf("p9")
    )
//Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
    val a15 = mapOf(
        "date1" to listOf("a1", "a2"),
        "date2" to listOf("a3")
    )
//Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
    val a16 = mutableMapOf(
        "Norway" to mutableMapOf("Oslo" to mutableListOf("a1", "a2")),
        "Iceland" to mutableMapOf("Reykjavík" to mutableListOf("a1", "a2"))
    )

}