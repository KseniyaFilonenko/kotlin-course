package org.example.lessons.lesson16.homeworks.geometricFigure

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}