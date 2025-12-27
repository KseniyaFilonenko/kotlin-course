package org.example.lessons
import org.example.lessons.lesson31.homework.PhoneNumberFormatter
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class PhoneNumberFormatterValidTest {

    private val formatter = PhoneNumberFormatter()

    @ParameterizedTest
    @CsvSource(
        "8 (922) 941-11-11, +7 (922) 941-11-11",
        "79229411111, +7 (922) 941-11-11",
        "+7 922 941 11 11, +7 (922) 941-11-11",
        "9229411111, +7 (922) 941-11-11",
        "abc +7 922 941 11 11, +7 (922) 941-11-11"
    )
    fun `formats valid phone numbers`(input: String, expected: String) {
        val result = formatter.formatPhoneNumber(input)
        assertEquals(expected, result)
    }
}