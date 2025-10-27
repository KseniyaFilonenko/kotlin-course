package org.example.lessons.lesson15.homeworks.furniture

open class Table(
    material: String,
    color: String,
    weight: Double,
    val shape: String,
    val legs: Int
) : Furniture(material, color, weight) {

    fun describeTable() {
        println("Форма стола: $shape, Количество ножек: $legs")
    }
}