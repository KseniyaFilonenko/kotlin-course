package org.example.lessons.lesson19.homeworks

// 2
class ListHolder<T> {
    private val list = mutableListOf<T>()

    fun add(element: T) {
        list.add(element)
    }

    fun get(): List<T> {
        return list.toList()
    }
}

// 1
fun <S> getMiddleElement(list: List<S>): S? {
    return if (list.size % 2 == 1) {
        list[list.size / 2]
    } else {
        null
    }
}

// 5
fun <K, V> transposition(map: Map<K, V>): Map<V, K> {
    return map.entries.associate { (key, value) -> value to key }
}