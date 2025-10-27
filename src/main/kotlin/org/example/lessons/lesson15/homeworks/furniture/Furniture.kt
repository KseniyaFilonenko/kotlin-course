package org.example.lessons.lesson15.homeworks.furniture

open class Furniture(
    val material: String,
    val color: String,
    val weight: Double
) {
    fun showInfo() {
        println("Материал: $material, Цвет: $color, Вес: $weight кг")
    }
}