package academy.learnprogramming.enums

fun main() {
    println( Department.ACCOUNTING.getDepartmentInfo() )
}

enum class Department(
        val fullName: String,
        val numEmployees: Int
) {
    HR("Human Resources", 2),
    IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3),
    SALES("Sales", 20);

    fun getDepartmentInfo() = "The $fullName department has $numEmployees people in their branch"
}