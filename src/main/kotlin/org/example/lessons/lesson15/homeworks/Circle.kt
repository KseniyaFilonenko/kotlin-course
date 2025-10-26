package org.example.lessons.lesson15.homeworks

class Circle(
    id: Int,
    val radius: Double
) : GeometricFigure(
    id,
    perimeter = 2 * Math.PI * radius,
    area = Math.PI * radius * radius
)