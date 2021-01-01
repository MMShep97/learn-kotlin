package academy.learnprogramming.lambdas

import java.lang.StringBuilder

fun main() {


    run { println("in lambda") }

    val employees = listOf(
            Employee("test", "test", 2020),
            Employee("test1", "test1", 2012)
    )

    println( employees.minBy { it.startYear } )

}

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach {

    }
}

fun countTo100() =
        StringBuilder().apply {
            for (i in 1..99) {
                append(i)
                append(", ")
            }
        }.toString()

data class Employee(
        val firstName: String,
        val lastName: String,
        val startYear: Int
)