package academy.learnprogramming.collectionslambdas

fun main() {
    val carsMap = mapOf(
            1 to Car("honda", 2015),
            2 to Car("toyota", 2016),
            3 to Car("honda", 2010)
    )

    println(
            carsMap
                .filter { it.value.type == "honda" }
                .map    { it.value.year }
    )

    // only use sequences (streams in java) for large intermediate results
    println(
            carsMap.asSequence()
                    .filter {
                        val type = it.value.type
                        println("filtering $type")
                        type == "honda"
                    }
                    .map {
                        val year = it.value.year
                        println("mapping $year")
                        year
                    }
                    .toList()
    )
}

open class Car(
        val type: String,
        val year: Int,
) {

}