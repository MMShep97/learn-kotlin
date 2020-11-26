package academy.learnprogramming.challenge2.kotlincode

class MountainBicycle(
        var seatHeight: Int,
        cadence: Int,
        speed: Int,
        gear: Int
): Bicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()
        println("""
            seatHeight: $seatHeight
        """.trimIndent())
    }
}