package academy.learnprogramming.lists

fun main() {
    val empty = emptyList<String>()

    val arr = arrayOf("black", "white", "green")
    val colorList = listOf(*arr)
    println(colorList)

    val numbers = listOf(1, 2, 3, 4)
    println(numbers.reversed())

//    val noDupsList = colorList.union()

    val map = mapOf<Int, Car>(
            1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016)
    )

    map.forEach{ (key, value) ->
        println("$key & $value")
    }

    val setInts = setOf(10, 15, 19, 5, 3, -22)
    println(setInts.filter { it % 2 != 0 } )

}

class Car(val color: String, val model: String, val year: Int) {}