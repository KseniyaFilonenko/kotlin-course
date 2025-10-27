package org.example.lessons.lesson15.homeworks.container

abstract class Container {
    val materials = mutableListOf<String>()
    abstract fun addMaterial(material: String)
}