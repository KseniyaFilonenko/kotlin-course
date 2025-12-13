package org.example.lessons.lesson27.homeworks

// 1
enum class TestStatus {
    PASSED,
    BROKEN,
    FAILED
}

enum class HousingType(val displayName: String) {
    APARTMENT("Квартира"),
    HOUSE("Дом"),
    STUDIO("Студия"),
    VILLA("Вилла"),
    COTTAGE("Коттедж")
}

enum class Planet(val distanceFromSunAU: Double, val massKg: Double) {
    MERCURY(0.39, 3.30e23),
    VENUS(0.72, 4.87e24),
    EARTH(1.0, 5.97e24),
    MARS(1.52, 6.42e23),
    JUPITER(5.20, 1.90e27),
    SATURN(9.58, 5.68e26),
    URANUS(19.2, 8.68e25),
    NEPTUNE(30.05, 1.02e26)
}

// 2
fun printHousingTypesByNameLength() {
    HousingType.entries
        .sortedBy { it.displayName.length }
        .forEach { println(it.displayName) }
}

// 3
fun runTest(test: () -> Unit): TestStatus {
    return try {
        test()
        TestStatus.PASSED
    } catch (e: AssertionError) {
        TestStatus.FAILED
    } catch (e: Throwable) {
        TestStatus.BROKEN
    }
}

// 4
fun findPlanet(filter: (Planet) -> Boolean): Planet {
    val result = Planet.entries.filter(filter)

    if (result.isEmpty()) {
        throw NoSuchElementException("Подходящая планета не найдена")
    }

    return result.first()
}

fun main() {
    println(printHousingTypesByNameLength())
    println(runTest {})
    println(runTest {
        throw AssertionError("Проверка не прошла")
    })
    val closePlanet = findPlanet { it.distanceFromSunAU < 1.0 }
    println(closePlanet)
}