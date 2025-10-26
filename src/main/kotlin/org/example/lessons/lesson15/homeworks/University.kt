package org.example.lessons.lesson15.homeworks

class University(
    name: String,
    location: String,
    degree: String,
    numberOfYears: Int,
    val qtyOfGroups: Int
) : EducationalInstitution(name, location, degree, numberOfYears)