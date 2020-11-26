package academy.learnprogramming.loops

fun main() {
    val range = 1..5
    val charRange = 'a'..'z'
    val stringRange = "ABD".."XYZ"

    println(3 in range)
    println('b' in charRange)
    println("CBY" in stringRange)
    println("XYZ" in stringRange)
    println("XZZ" in stringRange)

    val backwardRange = 5.downTo(1)
    val r = 5..1
    println(5 in r)
    println(5 in backwardRange)

//    val patternRange = 3..15
//    val stepThree = stepRange.step(3)
//    val reversedRange = patternRange.reversed(stepThree)

    for (num in 1..20 step 4) println(num)
    for (num in 20 downTo 10 step 5) println(num)

    val numbers = listOf(1,2,3,4,5)
    numbers.forEachIndexed { index, number -> println("Number: $number at index: $index")}

}