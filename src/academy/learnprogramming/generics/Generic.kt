package academy.learnprogramming.generics

import java.lang.Appendable
import java.math.BigDecimal

class Generic {
}

fun main() {
    val list = mutableListOf(
            BigDecimal(0.23),
            BigDecimal(-0.41),
            BigDecimal(3.23)
    )

    list.printCollection()
    println( list.convertToInt() )
    append(StringBuilder("String 1"), StringBuilder("String 2"))
}

fun <T> List<T>.printCollection() {
    this.forEach { println(it) }
}

fun <T: Number> List<T>.convertToInt(): List<Int> {
    return this.map {
        it.toInt()
    }
}

fun <T> append(item1: T, item2: T) where T: CharSequence, T: Appendable {
    println("Result is ${item1.append(item2)}")
}