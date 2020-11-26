package academy.learnprogramming.objects

fun main() {
    val bringInTheString = "OMG"
    val someClass = SomeClass.assignLowerOrUpper(bringInTheString, true)
    println("class str => ${someClass.someString}")
    listOf(1, 2, 3)

    println(Test.accessPrivateVar())
}

class SomeClass(val someString: String) {

    companion object Companion {
        fun justAssign(str: String) = SomeClass(str)
        fun assignLowerOrUpper(str: String, lowerCase: Boolean): SomeClass {
            return if (lowerCase) {
                SomeClass(str.toLowerCase())
            } else {
                SomeClass(str.toUpperCase())
            }
        }
    }
}

class Test() {
    companion object {
        private val testVal = 5

        fun accessPrivateVar() = "Accessing private var: $testVal"
    }
}