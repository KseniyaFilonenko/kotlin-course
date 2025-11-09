package org.example.lessons.lesson18.homeworks

class Refrigerator(name: String, maxTemp: Int = 8) : TemperatureOpenableDevice(name, maxTemp) {

    override fun setTemperature(temp: Int) {
        if (!isPoweredOn) {
            println("$name: включите питание, прежде чем устанавливать температуру")
            return
        }
        super.setTemperature(temp)
    }
}