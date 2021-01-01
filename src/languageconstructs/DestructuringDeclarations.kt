package languageconstructs

class DestructuringDeclarations {
}

data class Car(
        val type: String,
        val value: Double,
        val color: String,
)

fun main() {
    val car = Car("honda", 2232.00, "red")
    val (type, value, color) = car

    println("Car's type is $type")

    val car2 = Car("civic", 23.1, "blue")
    val cars = listOf(car, car2)

    for ((type, value) in cars) {
        println(type)
        println(value)
    }

    val (val1, val2) = Pair("boy", "boyo")
}

// https://kotlinlang.org/docs/reference/multi-declarations.html