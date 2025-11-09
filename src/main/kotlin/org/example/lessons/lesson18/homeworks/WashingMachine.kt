package org.example.lessons.lesson18.homeworks

class WashingMachine(
    name: String,
    maxTemp: Int = 90,
    override val capacity: Int = 50
) : TemperatureOpenableDevice(name, maxTemp), WaterContainer, Drainable, Timable {

    private var waterLevel: Int = 0
    private var timer: Int = 0

    override fun fillWater(amount: Int) {
        if (waterLevel + amount > capacity) {
            val added = capacity - waterLevel
            waterLevel = capacity
            println("$name: долили $added литров воды (текущее: $waterLevel / $capacity)")
        } else {
            waterLevel += amount
            println("$name: долили $amount литров воды (текущее: $waterLevel / $capacity)")
        }
    }

    override fun getWater(amount: Int) {
        if (amount > waterLevel) {
            println("$name: забрали $waterLevel литров воды (осталось: 0)")
            waterLevel = 0
        } else {
            waterLevel -= amount
            println("$name: забрали $amount литров воды (осталось: $waterLevel)")
        }
    }

    override fun connectToDrain() {
        println("$name: подключен к сливу")
    }

    override fun drain() {
        println("$name: сливаем воду (было $waterLevel литров)")
        waterLevel = 0
    }

    override fun setTimer(time: Int) {
        timer = time
        println("$name: таймер установлен на $time минут")
    }

    override fun setTemperature(temp: Int) {
        if (!isPoweredOn) {
            println("$name: нельзя задать температуру — питание выключено")
            return
        }
        super.setTemperature(temp)
    }
}

fun main() {
    val washer = WashingMachine("Стиральная машина LG")
    washer.fillWater(30)
    washer.getWater(20)
    washer.powerOn()
    washer.setTemperature(60)
    washer.execute()
    washer.setTimer(90)
    washer.connectToDrain()
    washer.drain()
}