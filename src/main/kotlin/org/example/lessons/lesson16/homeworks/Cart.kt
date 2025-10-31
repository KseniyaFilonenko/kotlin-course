package org.example.lessons.lesson16.homeworks

//Класс “Корзина товаров”: содержит поле словаря из ID товаров и их количества.
//Базовый метод addToCart(itemId) добавляет одну единицу товара к уже существующим в корзине.
//Выполнить перегрузку addToCart который:
//Принимает два аргумента (itemId и количество amount)
//Принимает словарь из id и количества и добавляет всё в корзину
//Принимает список из id (добавляет по одной единице).
//Учесть, что если товар уже есть в корзине, нужно увеличить его количество, если нет - добавить.
//Попробуй создать корзину и положить в неё товар разными способами, потом распечатать корзину в консоль.
//Переопредели у корзины метод toString для красивого форматирования содержимого таблицы, включая итоговое
// количество артикулов и общее количество всего товара в корзине.

class Cart {
    val items = mutableMapOf<Int, Int> ()
    fun addToCart(itemId: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = (items[itemId] ?: 0) + amount
    }

    fun addToCart(itemsToAdd: Map<Int, Int>) {
        for ((id, amount) in itemsToAdd) {
            items[id] = (items[id] ?: 0) + amount
        }
    }

    fun addToCart(itemIds: List<Int>) {
        for (id in itemIds) {
            items[id] = (items[id] ?: 0) + 1
        }
    }
}