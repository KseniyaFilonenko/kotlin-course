package org.example.lessons.lesson29.homeworks

import com.google.gson.Gson

data class Address(
    val street: String,
    val city: String,
    val postalCode: Int
)
data class User(
    val id: Int,
    val name: String,
    val isActive: Boolean,
    val address: Address
)

fun main() {
    val address = Address("Baker Street", "London", 221)
    val user = User(1, "Sherlock Holmes", true, address)
    val gson = Gson() // Создаём экземпляр Gson
    val json = gson.toJson(user) // Сериализация объекта
    println("JSON: $json")

    val json1 = """{"id":1,"name":"Sherlock Holmes","isActive":true,"address":{"street":"Baker Street","city":"London","postalCode":221}}"""
    val gson1 = Gson()
    val user1 = gson.fromJson(json, User::class.java) // Десериализация JSON в объект
    println("User: $user1")
}