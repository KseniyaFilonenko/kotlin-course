package org.example.lessons.lesson18.homeworks

abstract class TemperatureOpenableDevice(
    name: String,
    override val maxTemperature: Int
) : ProgrammableDevice(name), TemperatureRegulatable, Openable {

    private var currentTemperature: Int = 0
    private var isOpen: Boolean = false

    override fun open() {
        if (!isOpen) {
            isOpen = true
            println("$name открыто.")
        } else {
            println("$name уже открыто.")
        }
    }

    override fun close() {
        if (isOpen) {
            isOpen = false
            println("$name закрыто.")
        } else {
            println("$name уже закрыто.")
        }
    }

    override fun setTemperature(temp: Int) {
        if (temp <= maxTemperature) {
            currentTemperature = temp
            println("$name установлена температура: $temp°C")
        } else {
            println("Ошибка: $temp°C превышает максимально допустимую температуру ($maxTemperature°C) для $name.")
        }
    }
}