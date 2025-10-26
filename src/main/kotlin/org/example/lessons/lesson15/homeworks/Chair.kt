package org.example.lessons.lesson15.homeworks

class Chair(
    material: String,
    color: String,
    weight: Double,
    val hasBackrest: Boolean
) : Furniture(material, color, weight)