package org.example.lessons.lesson15.homeworks.education

class HighSchool(
    name: String,
    location: String,
    degree: String,
    numberOfYears: Int,
    kindOfSchool: String,
    val hasAdvancedCourses: Boolean
) : School(name, location, degree, numberOfYears, kindOfSchool)