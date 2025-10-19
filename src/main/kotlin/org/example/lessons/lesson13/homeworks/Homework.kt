package org.example.lessons.lesson13.homeworks

fun main() {


//Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
    val map1 = mapOf("Test1" to 1.2, "Test2" to 1.1, "Test3" to 2.0)
    val avrValue = map1.values.average()

//Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными.
// Выведите список всех тестовых методов.
    val map2 = mapOf("test" to "metadata", "test2" to "metadata2", "test3" to "metadata3")
    val listTestMethods = map2.keys.toList()

//В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val map3 = mutableMapOf("test" to "metadata", "test2" to "metadata2", "test3" to "metadata3")
    map3.put("test4", "metadata4")

//Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
    val map4 = mapOf("test" to "passed", "test2" to "failed", "test3" to "skipped")
    val count = map4.count { it.value == "passed" }

//Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления).
    val map5 = mutableMapOf("bug1" to "inprogress", "bug2" to "backlog", "bug3" to "fixed")
    val newMap5 = map5.filterValues { it != "fixed" }

//Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
    val map6 = mapOf("url.com" to "200 Success", "url2.com" to "404 Not Found")
    map6.forEach { (url, status) ->
        println("Страница: $url, Статус проверки: $status")
    }

//Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val map7 = mapOf("200 Success" to 0.2, "404 Not Found" to 1.5)
    map7.filter { it.value > 1 }

//В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки).
// Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val map8 = mapOf("url.com" to "200 Success", "url2.com" to "404 Not Found")
    val endpoint = "url3.com"
    val status = map8.getOrElse(endpoint) { "Не протестирован" }

//Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение - сама конфигурация),
// получите значение для "browserType". Ответ не может быть null.
    val map9 = mapOf("name" to "configuration", "browserType" to "configuration2", "name3" to "configuration3")
    map9.getValue("browserType")

//Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val map10 = mutableMapOf("version" to 1, "version2" to 2, "version3" to 3)
    val new = map10 + ("version4" to 4)

//Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства,
// значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.
    val map11 = mapOf("ios" to "settings", "android" to "settings2", "desktop" to "settings3")
    val searchedModel = map11.getOrDefault("honor", "default")

//Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
    val map12 = mapOf(200 to "success", 101 to "info", 404 to "not found", 505 to "server down")
    map12.containsKey(300)

//Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения —
// статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии,
// идентификаторы которых соответствуют определённой версии тестов, то-есть в ключе содержится требуемая версия.
    val map13 = mapOf("TestID_Version" to "Passed", "TestID_Version2" to "Failed", "TestID_Version3" to "Skipped")
    map13.filterKeys { it.contains("In progress") && it == "TestID_Version" }

//У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования.
// Проверьте, есть ли модули с неудачным тестированием.
    val map14 = mapOf("module1" to "passed", "module2" to "failed", "module3" to "failed")
    map14.filterNot { it.value == "failed" }

//Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val map15 = mutableMapOf("key" to "value", "key2" to "value2")
    map15.putAll(map11)

//Объедините два неизменяемых словаря с данными о багах.
    val map16 = mapOf("bug1" to "inprogress", "bug2" to "backlog", "bug3" to "fixed")
    val map17 = mapOf("bug3" to "backlog", "bug4" to "fixed")
    val map18 = map16 + map17

//Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val map19 = mutableMapOf("autotest" to 78, "autotest2" to 80, "autotest3" to 100)
    map19.remove("autotest3")

//Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val map26 = mapOf("dsd" to "ddd", "rrr" to "hhj")
    map26.isEmpty()

//Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    val map27 = mapOf("dsd" to "ddd", "rrr" to "hhj")
    map27.isNotEmpty()

//Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    val map28 = mapOf("1" to "success", "2" to "success", "3" to "failed")
    val allPassed = map28.all { it -> it.value == "success" }

//Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    val anyFailed = map28.any { it.value == "failed" }

}