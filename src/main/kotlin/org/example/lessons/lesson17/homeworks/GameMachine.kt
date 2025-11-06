package org.example.lessons.lesson17.homeworks

class GameMachine(
    val color: String,
    val model: String,
    val owner: String,
    val supportPhone: String,
    private val pinCode: Int,
    val gamePrice: Double
) {
    var isOn: Boolean = false
        private set

    var isOsLoaded: Boolean = false
        private set

    var hasJoystick: Boolean = true
    private var balance: Double = 0.0
    private var isSessionPaid: Boolean = false

    private val installedGames: MutableList<String> = mutableListOf()

    fun turnOn() {
        isOn = true
        println("Автомат включён")
    }

    fun turnOff() {
        isOn = false
        isOsLoaded = false
        println("Автомат выключен")
    }

    fun loadOS() {
        if (isOn) {
            isOsLoaded = true
            println("ОС загружена")
        } else {
            println("Сначала включите автомат")
        }
    }

    fun shutdownOS() {
        if (isOsLoaded) {
            isOsLoaded = false
            println("ОС завершила работу")
        }
    }

    fun showGames() {
        if (installedGames.isEmpty()) {
            println("Нет установленных игр")
        } else {
            println("Список игр:")
            installedGames.forEach { println(it) }
        }
    }

    fun startGame(gameName: String) {
        if (!isSessionPaid) {
            println("Оплатите игровой сеанс перед запуском игры")
            return
        }
        if (gameName in installedGames) {
            println("Запуск игры: $gameName")
            isSessionPaid = false
        } else {
            println("Игра '$gameName' не найдена")
        }
    }

    fun payForSession(amount: Double) {
        if (amount >= gamePrice) {
            isSessionPaid = true
            balance += amount
            println("Игровой сеанс оплачен")
        } else {
            println("Недостаточно средств для оплаты")
        }
    }

    fun withdrawCash(pin: Int): Double {
        return if (pin == pinCode) {
            val cash = balance
            balance = 0.0
            println("Выдано $cash рублей")
            cash
        } else {
            println("Неверный пин-код")
            0.0
        }
    }

    private fun openSafe(pin: Int): Boolean {
        return pin == pinCode
    }
}
