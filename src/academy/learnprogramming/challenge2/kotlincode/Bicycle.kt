package academy.learnprogramming.challenge2.kotlincode

open class Bicycle(
        private var cadence: Int,
        private var speed: Int,
        private var gear: Int
) {


    fun applyBrake(decrement: Int) {
        this.speed -= decrement
    }

    fun speedUp(increment: Int) {
        this.speed += increment
    }

    open fun printDescription() {
        println("""
            Cadence: $cadence
            Speed: $speed
            Gear: $gear
        """.trimIndent())
    }

}