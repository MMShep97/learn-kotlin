package variance

class Covariance {
}

fun main() {
    val shortList: List<Short> = listOf(1, 2, 3, 4, 5)
    convertToInt(shortList)

    val shortListMutable: MutableList<Short> = mutableListOf(1, 2, 3, 4, 5)
    convertToIntMutable(shortListMutable)

    val garden = Garden<Rose>()
    garden.waterGarden()
}

fun convertToInt(collection: List<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}

fun <T> convertToIntMutable(collection: MutableList<T>) {
    for (num in collection) {
        if (num is Number)
        println("${num.toInt()}")
    }
}

class Garden<out T: Flower>(
    private val flowers: List<T> = listOf()
) {
    private var isWatered = false

    fun waterGarden() = println("Watering Garden")
            .also { isWatered = true }
            .also { println("Garden Watered") }

    fun pickFlower(i: Int): T = flowers[i]


}

open class Flower {

}

class Rose: Flower() {

}

class Daffodil: Flower() {

}