package academy.learnprogramming.challenges.challenge7

fun main() {

    val joe = Person("Joe", "Jones", 45)
    val (fName, lName, age) = joe
    println("fname = $fName")

    //first item in pair is firstname, second is lastname
    /// output is list of pairs
    val peopleMap = mapOf(
            "Jones" to Person("Joe", "Smith", 12),
            "Wilson" to Person("Jane", "Wilson", 122),
    )
    val pairList: List<Pair<String, String>> = peopleMap.map { entry ->
        val (firstName, lastName) = entry.value
        Pair(firstName, lastName)
    }

    peopleMap.also {
        it.map {
            println(it.value.firstName)
        }
    }

    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf( -4, 35, -83, 22, 1010, 1, 15)
    val list3 = list1.filter {
        it in list2
    }

    val regularPaper = Box<Regular>()
    val premiumPaper = Box<Premium>()
    var paper = Box<Paper>()
    paper = regularPaper
}

data class Person(
    val firstName: String,
    val lastName: String,
    val age: Int
)

class Box<out T> {

}

open class Paper {

}

class Regular: Paper() {

}

class Premium: Paper() {

}