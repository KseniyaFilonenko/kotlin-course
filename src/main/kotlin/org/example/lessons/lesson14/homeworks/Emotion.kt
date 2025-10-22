package org.example.lessons.lesson14.homeworks

// Аспект реальности: эмоция. Создайте класс Emotion, который представляет эмоцию. У него должно быть свойство type (String) и intensity (Int).
// Добавьте метод express(), который выводит описание эмоции в зависимости от её типа и интенсивности.

class Emotion (val type: String, val intensity: Int) {
    fun express() {
        if (type == "smile" && intensity >= 3) {
            println("happy")
        } else {
            println("sad")
        }
    }

    fun express2() {
        when {
            type == "smile" && intensity >= 3 -> println("very happy")
            type == "smile" -> println("happy")
            type == "cry" && intensity >= 3 -> println("very sad")
            else -> println("sad")
        }
    }
}