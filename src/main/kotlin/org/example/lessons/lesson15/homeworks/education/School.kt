package org.example.lessons.lesson15.homeworks.education

open class School(
    name: String,
    location: String,
    degree: String,
    numberOfYears: Int,
    val kindOfSchool: String
) : EducationalInstitution(name, location, degree, numberOfYears) {

    fun getSchoolType() {
        println("Тип школы: $kindOfSchool")
    }
}