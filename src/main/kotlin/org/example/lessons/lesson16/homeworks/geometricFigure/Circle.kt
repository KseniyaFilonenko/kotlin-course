package org.example.lessons.lesson16.homeworks.geometricFigure

const val PI = 3.14159

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return PI * (radius * radius)
    }
}