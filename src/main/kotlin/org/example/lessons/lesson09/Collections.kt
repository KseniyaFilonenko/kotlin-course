package org.example.lessons.lesson09

val doubles = arrayOf(1.1, 1.2, 1.3)
val doubleArray = doubleArrayOf(1.2, 1.3)
val emptyArray = Array(5) {""}
val emptyNullableArray = arrayOfNulls<Int>(5)
val readOnly: List<String> = listOf("a", "b", "c") // but  - var readOnly: List<String> = listOf("a", "b", "c")
val mutableList: MutableList<String> = mutableListOf("a", "b", "l")
// doubles[0] = 10
val set: Set<Int> = setOf(1,2,3)
val mutableSet: MutableSet<Int> = mutableSetOf()

fun main() {
    mutableList.add("v")
    mutableList.removeAt(1)
    mutableList.remove("a")
    mutableList.add(1, "f")
    mutableList[0] = "u"
}