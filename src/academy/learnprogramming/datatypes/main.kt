package academy.learnprogramming.datatypes

fun main(args: Array<String>) {
    val longArray : Array<Long> = arrayOf(1L, 2L, 3L)
    println("1st is ${longArray.get(0)}, 2nd is ${longArray[1]} all of type ${longArray::class.qualifiedName}")

    // iterator
    val allZeroes = Array(100) { 0 }
    var someArray : Array<Int>
    var otherArray : Array<Double>

    someArray = arrayOf(1, 2, 3, 4)
    otherArray = Array(3) { d -> d * 10.2 }
    for (number in someArray) print("$number ")
    for (number in otherArray) print("$number ")

}

fun getThatMoney(amount: Number): Number {
    return amount
}