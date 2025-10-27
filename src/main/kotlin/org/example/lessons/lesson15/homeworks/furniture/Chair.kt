package org.example.lessons.lesson15.homeworks.furniture

class Chair(
    material: String,
    color: String,
    weight: Double,
    val hasBackrest: Boolean
) : Furniture(material, color, weight)