package org.example.lessons.lesson14.homeworks

//Мероприятие: концерт. Создайте класс, который будет представлять концерт. У него должны быть свойства “группа”, “место проведения”, “стоимость”,
// “вместимость зала”. Также приватное поле “проданные билеты”.
// Добавьте метод, который выводит информацию о концерте, и метод “купить билет”, который увеличивает количество проданных билетов на один.

class Concert (val group: String, val place: String, val price: Double, val amountOfPlace: Int, private var soldTickets: Int) {
    fun info () {
        println("$group, $place, $price, $amountOfPlace, $soldTickets")
    }

    fun buyTicket () {
        soldTickets ++
    }
}