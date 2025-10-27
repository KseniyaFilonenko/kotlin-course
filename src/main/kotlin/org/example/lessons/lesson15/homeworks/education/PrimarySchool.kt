package org.example.lessons.lesson15.homeworks.education

class PrimarySchool(
    name: String,
    location: String,
    degree: String,
    numberOfYears: Int,
    kindOfSchool: String,
    val hasMath: Boolean
) : School(name, location, degree, numberOfYears, kindOfSchool)