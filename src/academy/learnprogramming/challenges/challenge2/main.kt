package academy.learnprogramming.challenges.challenge2

import academy.learnprogramming.challenges.challenge2.kotlincode.Bicycle
import academy.learnprogramming.challenges.challenge2.kotlincode.MountainBicycle

fun main() {
    val mountainBicycle = MountainBicycle(2, 2, 2, 2)
    val regularBike = Bicycle(2, 2, 3)
    mountainBicycle.printDescription()
    regularBike.printDescription()
}