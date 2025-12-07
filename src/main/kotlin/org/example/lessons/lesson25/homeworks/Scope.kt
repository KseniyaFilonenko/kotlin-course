package org.example.lessons.lesson25.homeworks

// 3
fun logPersonInfo(person: Person) {
    with(person) {
        println(
            """
            ---- Person Info ----
            Name: $name
            Age: $age
            Email: $email
            ----------------------
            """.trimIndent()
        )
    }
}

// 6
fun Person?.toEmployee(position: String): Employee? {
    return this?.let { person ->
        Employee(
            name = person.name,
            age = person.age,
            position = position
        )
    }
}

fun main() {
    // 2
    val person = Person("Alice", 28).apply {
        email = "alice@mail.com"
    }

    val employee = Employee(person.name, person.age, "Developer").apply {
        email = person.email
        department = "IT"
    }

    employee.apply {
        println("Employee: name=$name, age=$age, position=$position, email=$email, department=$department")
    }

    // 3
    val person2 = Person("Alice", 28).also {
        it.email = "alice@example.com"
        logPersonInfo(it)
    }

    // 4
    val person3 = Person("Alice", 30).apply {
        email = "alice@mail.com"
    }

    val employee2 = with(person) {
        Employee(name, age, "Developer").apply {
            email = this@with.email
            department = "IT"
        }
    }

    // 5
    val person4 = Person("Alice", 30).apply {
        email = "alice@mail.com"
    }

    val employee3 = person.run {
        Employee(name, age, "Developer").apply {
            email = this@run.email
            department = "IT"
        }
    }
}
