package org.example.lessons.lesson19.homeworks

// 4
abstract class PhrasesToListOfStrings: Mapper<String, List<String>> {
    override fun map(from: String): List<String> {
        return from.split(" ")
    }

    override fun mapList(fromList: List<String>): List<List<String>> {
        return fromList.map { it.split(" ") }
    }
}