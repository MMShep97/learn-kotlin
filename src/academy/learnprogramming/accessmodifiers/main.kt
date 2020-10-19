package academy.learnprogramming.accessmodifiers

fun main(args: Array<String>) {
    val emp = Employee("bob", "smith", "janitor", 45000)
    print(emp::class.qualifiedName)

    val emp1 = Employee("Bob", "Smith", "Engineer", 60000)
    println(labelMultiply(3, 4, "Result: "))
    emp1._firstName.allToUppercase()
}

private class Employee(
        val _firstName: String,
        val _lastName: String,
        val _jobTitle: String,
        val _annualSalary: Int = 50000
) {
    fun test1() {
        val testArrayList = ArrayList<Any>()
    }

    fun test() {

    }

    fun test2(param: String, param1: Int) {
    }
}

fun labelMultiply(operand1: Int, op2: Int, label: String): String {
    return ("$label ${operand1 * op2}")
}

fun String.allToUppercase(): String {
    return this.toUpperCase()
}


open class Food(quantity: Int) {
    open fun printFoodType(type: Int) {
        println("Amount of food: $type")
    }
}

class Fruit(quantity: Int) : Food(quantity) {
    override fun printFoodType(quantity: Int) {
        println("Amount of fruit: $quantity")
    }
}

