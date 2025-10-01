package org.example.lessons.lesson07.homeworks

fun main() {
    whileDecrease()
}
//Задания для цикла for
//Прямой диапазон
//Напишите цикл for, который выводит числа от 1 до 5.
fun forSimple() {
    for (a in 1..5) {
        println(a)
    }
}
//Напишите цикл for, который выводит четные числа от 1 до 10.
fun forStepTwo() {
    for (b in 2..10 step 2) {
        println(b)
    }
}

//Обратный диапазон
//Создайте цикл for, который выводит числа от 5 до 1.
fun forDownFromFive () {
    for (c in 5 downTo  1) {
        println(c)
    }
}
//Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
fun forDownFromFiveWithStep () {
    for (d in 5 downTo  1 step 2) {
        println(d)
    }
}

//С шагом (step)
//Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
fun forStepTwo2() {
    for (e in 1..9 step 2) {
        println(e)
    }
}
//Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
fun forWithStep() {
    for (f in 1..20 step 3) {
        println(f)
    }
}

//Использование до (until)
//Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
fun forUntil() {
    val size = 15
    for (g in 3 until size step 2) {
        println(g)
    }
}


//Задания для цикла while
//Цикл while
//Создайте цикл while, который выводит квадраты чисел от 1 до 5.
fun whileCycle() {
    var symbol = 1
    while (symbol <= 5) {
        println(symbol * symbol)
        symbol++
    }
}
//Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
fun whileDecrease () {
    var j = 10
    while (j >= 5) {
        println(j)
        j--
    }
}


//Цикл do while
//Используйте цикл do while, чтобы вывести числа от 5 до 1.
fun doWhile() {
    var k = 5
    do {
        println(k)
        k--
    } while (k >= 1)
}
//Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
fun doWhileFromFive() {
    var counter = 5
    do {
        println(counter)
        counter++
    } while (counter < 10)
}

//Задания для прерывания и пропуска итерации
//Использование break
//Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
fun break1() {
    for (l in 1..10) {
        if (l == 6) {
            break
        }
        println(l)
    }
}
//Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
fun break2() {
    var i = 1
    while (true) {
        println(i)
        if (i == 10) {
            break
        }
        i++
    }
}

//Использование continue
//В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
fun continue1() {
    for (s in 1..10) {
        if (s % 2 == 0) {
            continue
        }
        println(s)
    }
}
//Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
fun continue2() {
    var i = 1
    while (i <= 10) {
        if (i % 3 == 0) {
            i++
            continue
        }
        println(i)
        i++
    }
}