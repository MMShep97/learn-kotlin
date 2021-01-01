package academy.learnprogramming.scopefunctions

class LambdaReceivers {

}

fun main() {
    val cars = listOf(
            Car("sedan", "red"),
            Car("honda", "blue"),
    )

    cars
        .also { println(it) }
        .sortedBy { it.color }
        .also { println("Sorted by: color")}

//////////////////////

    val numberList = mutableListOf<Double>()
    numberList.also { println("Populating the list") }
            .apply {
                add(2.71)
                add(3.14)
                add(1.0)
            }
            .also { println("Sorting the list") }
            .sort()

//    ///////////////////

    val numbers = mutableListOf("one", "two", "three")
    val countEndsWithE = numbers.run {
        add("four")
        add("five")
        count { it.endsWith("e") }
    }
    println("There are $countEndsWithE elements that end with e.")

    with(numbers) {
        val first = first()
        val last = last()
        println("First: $first, Last: $last")
    }

    numbers
        .map { it.length }
        .filter { it > 3 }
        .let(::println)
}

data class Car(val type: String, val color: String) {

}