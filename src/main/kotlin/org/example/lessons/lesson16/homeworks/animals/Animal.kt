package org.example.lessons.lesson16.homeworks.animals

open class Animal {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird())

    for (animal in animals) {
        animal.makeSound()
    }
}