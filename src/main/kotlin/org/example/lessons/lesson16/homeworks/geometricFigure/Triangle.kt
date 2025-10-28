package org.example.lessons.lesson16.homeworks.geometricFigure

class Triangle(val base: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }
}