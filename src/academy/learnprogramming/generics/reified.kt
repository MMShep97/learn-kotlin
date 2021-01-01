package academy.learnprogramming.generics

import java.math.BigDecimal

fun main() {
    val mixedList: List<Any> = listOf("string", 1, BigDecimal(22.5), BigDecimal(222.12232))

    getElementsOfType<BigDecimal>(mixedList)
}

// Reified allows generic type to be checked at runtime (must also be inline)
// take in a list of any,
inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {
    val newList = mutableListOf<T>()

    list.forEach { element ->
        if (element is T) {
            newList.add(element)
        }
    }

    return newList
}