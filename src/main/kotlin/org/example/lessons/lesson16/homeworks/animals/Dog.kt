package org.example.lessons.lesson16.homeworks.animals

class Dog : Animal() {
    override fun makeSound() {
        printColored("Bark", Colors.YELLOW)
    }
}