package org.example.lessons.lesson16.homeworks.animals

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird())

    for (animal in animals) {
        animal.makeSound()
    }
}