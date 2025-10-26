package org.example.lessons.lesson15.homeworks

class Quadrilateral(
    id: Int,
    perimeter: Double,
    area: Double
) : Polygon(4, id, perimeter, area) {
    fun quadrilateralInfo() {
        println("Это четырёхугольник с периметром $perimeter и площадью $area")
    }
}