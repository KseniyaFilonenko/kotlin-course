package org.example.lessons.lesson15.homeworks.container

class BottomContainer : Container() {
    override fun addMaterial(material: String) {
        materials.add(0, material)
    }
}