package org.example.lessons.lesson19.homeworks

// 3
interface Mapper<F, T> {
    fun map(from: F): T
    fun mapList(fromList: List<F>): List<T>
}