package org.example.lessons.lesson18.homeworks

abstract class ProgrammableDevice(name: String) : PoweredDevice(name), Programmable {

    private var currentProgram: String? = null

    override fun programAction(action: String) {
        currentProgram = action
        println("$name запрограммировано на действие: \"$action\"")
    }

    override fun execute() {
        if (!isPoweredOn) {
            println("$name не включено. Невозможно выполнить программу.")
            return
        }

        if (currentProgram != null) {
            println("$name выполняет программу: \"$currentProgram\"")
        } else {
            println("Для $name не задана программа.")
        }
    }
}