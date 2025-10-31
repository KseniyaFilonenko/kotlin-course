package org.example.lessons.lesson16.homeworks.printer

class LaserPrinter : Printer() {
    override fun print(string: String) {
        val words = string.split(" ")
        for (word in words) {
            printColored(word, Colors.BLACK, Background.WHITE)
        }
    }
}