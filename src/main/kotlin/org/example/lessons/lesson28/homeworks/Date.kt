package org.example.lessons.lesson28.homeworks

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

fun main() {

    // 1. Текущая метка времени
    val now = Instant.now()
    println("Текущая метка времени: $now")

    // 2. Дата рождения (пример)
    val birthday = LocalDate.of(1992, 2, 21)
    println("Дата рождения: $birthday")

    // 3. Период между датами
    val today = LocalDate.now()
    val period = Period.between(birthday, today)

    println("Полных лет: ${period.years}")

    // 4
    println(formatTemporal(LocalDate.now()))

    // 5
    val localDate = LocalDate.of(2024, 5, 10)
    println(formatTemporal(localDate))
    val localTime = LocalTime.of(14, 30, 45)
    println(formatTemporal(localTime))
    val localDateTime = LocalDateTime.of(2024, 5, 10, 14, 30, 45)
    println(formatTemporal(localDateTime))

    val zonedDateTime = ZonedDateTime.of(
        2024, 5, 10,
        14, 30, 45, 0,
        ZoneId.of("Europe/Minsk")
    )
    println(formatTemporal(zonedDateTime))
    val instant = Instant.ofEpochSecond(1_700_000_000)
    println(formatTemporal(instant))

    // 7
    val date2023 = LocalDate.of(2023, 2, 25)
    val date2024 = LocalDate.of(2024, 2, 25)

    val formatter = DateTimeFormatter.ofPattern("MM dd")

    println(date2023.format(formatter))
    println(date2024.format(formatter))

    // 8
    val newDate2023 = date2023.plusDays(10)
    println(newDate2023.format(formatter))

    // 9
    val newDate2024 = date2024.plusDays(10) // високосный год
    println(newDate2024.format(formatter))
}

// 4
fun formatTemporal(temporal: Temporal): String {
    return when (temporal) {
        is LocalDate ->
            temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))

        is LocalTime ->
            temporal.format(DateTimeFormatter.ofPattern("HH:mm:ss"))

        is LocalDateTime ->
            temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))

        is ZonedDateTime ->
            temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z"))

        is OffsetDateTime ->
            temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss XXX"))

        is Instant ->
            temporal.toString()

        else ->
            "Неизвестный тип времени"
    }
}

fun formatTemporalIso(temporal: Temporal): String =
    when (temporal) {
        is Instant -> DateTimeFormatter.ISO_INSTANT.format(temporal)
        is LocalDate -> DateTimeFormatter.ISO_LOCAL_DATE.format(temporal)
        is LocalTime -> DateTimeFormatter.ISO_LOCAL_TIME.format(temporal)
        is LocalDateTime -> DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(temporal)
        is ZonedDateTime -> DateTimeFormatter.ISO_ZONED_DATE_TIME.format(temporal)
        is OffsetDateTime -> DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(temporal)
        is OffsetTime -> DateTimeFormatter.ISO_OFFSET_TIME.format(temporal)
        else -> "Неподдерживаемый Temporal"
    }

// 6
private val boomerFrom = LocalDate.of(1946, 1, 1)
private val boomerTo = LocalDate.of(1964, 12, 31)

private val zoomerFrom = LocalDate.of(1997, 1, 1)
private val zoomerTo = LocalDate.of(2012, 12, 31)

fun LocalDate.identifyGeneration() {
    when (this) {
        in boomerFrom..boomerTo -> println("Это бумер!")
        in zoomerFrom..zoomerTo -> println("Это зумер!")
        else -> println("Это обычный человек")
    }
}
