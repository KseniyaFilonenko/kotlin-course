package org.example.lessons.lesson15.homeworks

class WritingDesk(
    material: String,
    color: String,
    weight: Double,
    shape: String,
    legs: Int,
    val hasDrawers: Boolean
) : Table(material, color, weight, shape, legs)