package org.example.lessons
import org.example.lessons.lesson31.homework.PhoneNumberFormatter
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class PhoneNumberFormatterInvalidTest {

    private val formatter = PhoneNumberFormatter()

    @ParameterizedTest
    @ValueSource(strings = [
        "12345",
        "+1 (922) 941-11-11",
        "",
        "999999999999999",
        "abcdef"
    ])
    fun `throws exception for invalid phone numbers`(input: String) {
        assertThrows(IllegalArgumentException::class.java) {
            formatter.formatPhoneNumber(input)
        }
    }
}