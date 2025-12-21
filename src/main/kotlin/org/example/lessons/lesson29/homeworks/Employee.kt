package org.example.lessons.lesson29.homeworks

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File

// 1

data class Employee(
    val name: String,
    val isEmployed: Boolean,
    val birthDate: String,
    val position: CharacterTypes,
    val subordinates: List<Employee> = emptyList()
)

enum class CharacterTypes {
    CTO,
    UX_UI,
    CRM,
    FRONTEND_DEV,
    TEAM_LEAD,
    BACKEND_DEV,
    PM,
    SYSADMIN,
    QA
}

// 2
val frontendDev1 = Employee(
    name = "Alice",
    isEmployed = true,
    birthDate = "1995-04-12",
    position = CharacterTypes.FRONTEND_DEV
)

val frontendDev2 = Employee(
    name = "Bob",
    isEmployed = true,
    birthDate = "1993-09-30",
    position = CharacterTypes.FRONTEND_DEV
)

val backendDev1 = Employee(
    name = "Charlie",
    isEmployed = true,
    birthDate = "1990-01-15",
    position = CharacterTypes.BACKEND_DEV
)

val backendDev2 = Employee(
    name = "Diana",
    isEmployed = true,
    birthDate = "1988-06-22",
    position = CharacterTypes.BACKEND_DEV
)

val frontendTeamLead = Employee(
    name = "Eve",
    isEmployed = true,
    birthDate = "1987-03-10",
    position = CharacterTypes.TEAM_LEAD,
    subordinates = listOf(frontendDev1, frontendDev2)
)

val backendTeamLead = Employee(
    name = "Frank",
    isEmployed = true,
    birthDate = "1985-11-05",
    position = CharacterTypes.TEAM_LEAD,
    subordinates = listOf(backendDev1, backendDev2)
)

val pm = Employee(
    name = "Grace",
    isEmployed = true,
    birthDate = "1986-07-18",
    position = CharacterTypes.PM,
    subordinates = listOf(frontendTeamLead, backendTeamLead)
)

val crm = Employee(
    name = "Henry",
    isEmployed = true,
    birthDate = "1992-02-27",
    position = CharacterTypes.CRM
)

val cto = Employee(
    name = "Irene",
    isEmployed = true,
    birthDate = "1980-12-01",
    position = CharacterTypes.CTO,
    subordinates = listOf(pm, crm)
)

// 3
fun saveCtoToFile(cto: Employee) {
    val gson = GsonBuilder().setPrettyPrinting().create()
    gson.toJson(cto).also {
        File("structure.json").writeText(it)
    }
}

// 4
fun readCtoFromFile() {
    val gson = Gson()
    val file = File("structure.json")

    if (file.exists()) {
        val jsonText = file.readText()
        val employee: Employee = gson.fromJson(jsonText, Employee::class.java)
        println(employee)
    } else {
        println("Файл structure.json не найден!")
    }
}

fun main() {
    println(cto)
    saveCtoToFile(cto)
    readCtoFromFile()
}
