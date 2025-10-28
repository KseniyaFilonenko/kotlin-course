package org.example.lessons.lesson16.homeworks.animals

class Bird : Animal() {
    override fun makeSound() {
        printColored("Tweet", Colors.CYAN)
    }
}