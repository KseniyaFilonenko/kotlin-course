package org.example.lessons.lesson16.homeworks.animals

class Cat : Animal() {
    override fun makeSound() {
        printColored("Meow", Colors.PURPLE)
    }
}