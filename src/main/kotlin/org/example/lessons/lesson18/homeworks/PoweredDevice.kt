package org.example.lessons.lesson18.homeworks


abstract class PoweredDevice(val name: String) : Powerable {

    var isPoweredOn: Boolean = false

    override fun powerOn() {
        if (!isPoweredOn) {
            isPoweredOn = true
            println("$name включено.")
        } else {
            println("$name уже было включено.")
        }
    }

    override fun powerOff() {
        if (isPoweredOn) {
            isPoweredOn = false
            println("$name выключено.")
        } else {
            println("$name уже было выключено.")
        }
    }
}
