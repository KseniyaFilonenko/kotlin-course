package org.example.lessons.lesson15.homeworks

class Triangle(
    id: Int,
    perimeter: Double,
    area: Double
) : Polygon(3, id, perimeter, area) {
    fun triangleInfo() {
        println("Это треугольник с периметром $perimeter и площадью $area")
    }
}