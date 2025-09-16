package org.example.lessons.lesson05.homeworks

fun main() {
    //Задача 1
    //Контекст: Вы изучаете физическое явление затухания звука в помещении.
    // У вас есть измеренное значение начальной интенсивности звука, но из-за ограничений оборудования
    // данные о коэффициенте затухания иногда могут быть неизвестны.
    //Задача: Рассчитать предполагаемую интенсивность звука после затухания. Интенсивность звука после затухания
    // пропорциональна начальной интенсивности, умноженной на коэффициент затухания. Если коэффициент затухания
    // неизвестен, использовать стандартное значение 0.5.
    val startValue: Double = 1.0
    val coefficient: Double? = 0.1
    val baseCoefficient = 0.5
    val final = startValue * (coefficient ?: baseCoefficient)
    println(final)

    //Задача 2
    //Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз,
    // которая составляет 0,5% от его стоимости. В случае, если стоимость не указана, то берётся стандартная стоимость в $50
    //Задача: Рассчитать полную стоимость доставки.
    val insuranceCoefficient = 0.005
    val standartDeliveryCost: Double = 50.0
    val deliveryCost: Double? = null
    val someProductCost: Double = 20.0
    val insurance = (deliveryCost ?: standartDeliveryCost) * insuranceCoefficient
    val finalCost = someProductCost + insurance
    println(finalCost)

    //Задача 3
    //Контекст: Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление,
    // которое должно быть зафиксировано. Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять.
    // Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.
    val atmPressure: Double? = null
    val message: String = "no data"
    val finalResult = atmPressure ?: message
    println(finalResult)
}