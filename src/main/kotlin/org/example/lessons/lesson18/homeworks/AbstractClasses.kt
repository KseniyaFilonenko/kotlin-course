package org.example.lessons.lesson18.homeworks

import java.io.InputStream

abstract class RefrigeratorFirst : Powerable, Openable, TemperatureRegulatable, LightEmitting, Movable, Cleanable {
    abstract override fun powerOn()
    abstract override fun powerOff()
    abstract override fun open()
    abstract override fun close()
    abstract override val maxTemperature: Int
    abstract override fun emitLight()
    abstract override fun move(direction: String, distance: Int)
    abstract override fun clean()
}

abstract class WashingMachineFirst : Powerable, Openable, WaterContainer, WaterConnection, Drainable, Timable,
    AutomaticShutdown {
    abstract override fun powerOn()
    abstract override fun powerOff()

    abstract override fun open()
    abstract override fun close()

    abstract override val capacity: Int
    abstract override fun fillWater(amount: Int)
    abstract override fun getWater(amount: Int)

    abstract override fun connectToWaterSupply()
    abstract override fun connectToDrain()
    abstract override fun drain()

    abstract override fun setTimer(time: Int)

    abstract override val sensorType: String
    abstract override val maxSensoredValue: Int
    abstract override fun startMonitoring()
}

abstract class SmartLamp : Powerable, LightEmitting, Programmable, Rechargeable {
    abstract override fun powerOn()
    abstract override fun powerOff()

    abstract override fun emitLight()
    abstract override fun completeLiteEmission()

    abstract override fun programAction(action: String)
    abstract override fun execute()

    abstract override fun getChargeLevel(): Double
    abstract override fun recharge()
}

abstract class ElectronicClock : Powerable, Timable, BatteryOperated, Programmable {
    abstract override fun powerOn()
    abstract override fun powerOff()

    abstract override fun setTimer(time: Int)

    abstract override fun getCapacity(): Double
    abstract override fun replaceBattery()

    abstract override fun programAction(action: String)
    abstract override fun execute()
}

abstract class RobotVacuum : Powerable, Movable, Cleanable, Rechargeable, Programmable, AutomaticShutdown {
    abstract override fun powerOn()
    abstract override fun powerOff()

    abstract override fun move(direction: String, distance: Int)
    abstract override fun clean()

    abstract override fun getChargeLevel(): Double
    abstract override fun recharge()

    abstract override fun programAction(action: String)
    abstract override fun execute()

    abstract override val sensorType: String
    abstract override val maxSensoredValue: Int
    abstract override fun startMonitoring()
}

abstract class MechanicalClock : Mechanical, Timable {
    abstract override fun performMechanicalAction()
    abstract override fun setTimer(time: Int)
}

abstract class Flashlight : Powerable, LightEmitting, BatteryOperated, Rechargeable {
    abstract override fun powerOn()
    abstract override fun powerOff()

    abstract override fun emitLight()
    abstract override fun completeLiteEmission()

    abstract override fun getCapacity(): Double
    abstract override fun replaceBattery()

    abstract override fun getChargeLevel(): Double
    abstract override fun recharge()
}

abstract class CoffeeMachine : Powerable, WaterContainer, Programmable, Timable, Drainable, AutomaticShutdown,
    Openable {
    abstract override fun powerOn()
    abstract override fun powerOff()

    abstract override val capacity: Int
    abstract override fun fillWater(amount: Int)
    abstract override fun getWater(amount: Int)

    abstract override fun programAction(action: String)
    abstract override fun execute()

    abstract override fun setTimer(time: Int)

    abstract override fun connectToDrain()
    abstract override fun drain()

    abstract override val sensorType: String
    abstract override val maxSensoredValue: Int
    abstract override fun startMonitoring()

    abstract override fun open()
    abstract override fun close()
}

abstract class SmartSpeaker : Powerable, SoundEmitting, Programmable, LightEmitting {
    abstract override fun powerOn()
    abstract override fun powerOff()

    abstract override fun setVolume(volume: Int)
    abstract override fun mute()
    abstract override fun playSound(stream: InputStream)

    abstract override fun programAction(action: String)
    abstract override fun execute()

    abstract override fun emitLight()
    abstract override fun completeLiteEmission()
}