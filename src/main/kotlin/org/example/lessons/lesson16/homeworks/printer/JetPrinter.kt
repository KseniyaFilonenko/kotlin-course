package org.example.lessons.lesson16.homeworks.printer

class JetPrinter : Printer() {
    override fun print(string: String) {
        val palette: List<Pair<String, String>> = listOf(
            Colors.RED to Background.WHITE,
            Colors.GREEN to Background.BLUE,
            Colors.YELLOW to Background.PURPLE,
            Colors.BLUE to Background.YELLOW,
            Colors.PURPLE to Background.CYAN,
            Colors.CYAN to Background.RED,
            Colors.WHITE to Background.BLACK,
            Colors.BLACK to Background.GREEN
        )
        val words = string.split(" ")
    }
}