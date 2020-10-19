package academy.learnprogramming.practice
typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {

}

fun addTwoNumbersTogether(firstNum: Double, secondNum: Double): Double {
    return firstNum + secondNum
}

class Employee(var name: String, val employeeId: Int) {
    override fun toString(): String {
        return "Employee(name='$name', employeeId=$employeeId)"
    }
}