package org.example.lessons.lesson15.homeworks.education

open class EducationalInstitution(
    val name: String,
    val location: String,
    val degree: String,
    val numberOfYears: Int
) {

    fun getProgramDuration() {
        println("Длительность программы обучения: $numberOfYears лет")
    }

    fun getDegreeInfo() {
        println("Выдаваемая степень/уровень образования: $degree")
    }
}