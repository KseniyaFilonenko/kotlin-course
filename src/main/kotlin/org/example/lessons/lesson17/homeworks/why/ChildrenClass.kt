package org.example.lessons.lesson17.homeworks.why

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // это свойство дочернего класса, а не поле базового, но мы передали его тут в базовый конструктор
    publicVal: String
) : BaseClass(privateVal, protectedVal, privateVal) {
    // 11. объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // это публичный метод базового класса и наследуется дочерним

    // 12. проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    // "Печать из класса BaseClass" - функция printText() содержит приватный метод privatePrint() базового класса, который не наследуется и не переопределяется
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }
}

fun main() {
    val child = ChildrenClass(
        privateVal = "1",
        protectedVal = "2",
        publicVal = "3"
    )

    println(child.getAll())
    println(child.printText())
}