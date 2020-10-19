package academy.learnprogramming.inheritance

fun main() {

}

class testClass : subInterface {
    override fun testMethod(param1: String) {
        TODO("Not yet implemented")
    }

    override fun testSubMethod() {
        super.testSubMethod()
    }


}

interface parentInterface {
    fun testMethod(param1: String)
    fun testSubMethod() {

    }
}

interface subInterface : parentInterface {

}