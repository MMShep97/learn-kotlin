package academy.learnprogramming.nullreferences

import java.lang.Exception

fun main() {

    val str: String? = null
    val str1: String? = null
    val str2: String? = "Heyo"
    val countryCode : String = str ?: "Default String"
    println(countryCode)

    val testArray: Any = arrayOf(1,2,3,4)
    val str3 = testArray as? String
    println(str3)
    val str4: String = "hey"
    val str5: String? = "test"
    val str6 = str5 as? String
    println("str: $str6")

    str5?.let { println(it) }
    // ```<var> ?: <default var>``` elvis operator--what to default to if var is null
    val nullableInts = arrayOfNulls<Int>(5)
    for (i in nullableInts) {
        print(" $i")
    }
    println()
    nullableInts[3] = 4
    nullableInts[0] = 0
    for (i in nullableInts) {
        val value = i ?: "no value"
        println(" $value")
    }


//    CHALLENGES

    // declare non-nullable float variable two ways, assign to value -3847.384
    var float1: Float = -3947.384f
    var float2 = -3947.384f

    // change both variable declarations into nullable vars
//    var float1: Float? = -3947.384f
//    var float2: Float? = -3947.384f

    //declare an array of type non-nullable short. make it size 5, and assign to values 1,2,3,4,5
    val array: Array<Short> = arrayOf(1,2,3,4,5)
    val array1 = shortArrayOf(1,2,3,4,5)

    //declare array of nullable ints and initialize w/ values 5,10,15,20, all the way to 200
    val intArray = Array<Int?>(200/5) { i -> (i + 1) * 5}
    val doubleArray = Array<Double?>(200/5) { i -> (i + 1) * 5.1 }
    for (i in intArray) print(" $i")

    //call java method with following signature from kotlin
    //public void method1(charp[ charArray). Declare array you could pass to method
    //and initialize it w/ values 'a', 'b', and 'c'
    val charArray = charArrayOf('a','b','c')


    //
    val x: String? = "I AM IN UPPERCASE"
    val nullX: String? = null
    val newX : String = x?.toLowerCase() ?: "I give up!"
    val newNullX : String = nullX?.toLowerCase() ?: "I give up!"
    println()
    println(newX)
    println(newNullX)

    //
    //use let function to lowercase string, then replace "am" with "am not" in the result
    val testString = x?.let { it.toLowerCase().replace("am", "am not") }
    println("Is x null or not... string -> ${testString ?: "yes, it is null"} ")

    // myNonNullVariable can't contain null, so assert it isn't null
    val myNonNullVariable: Int? = 2
    try {
        println(myNonNullVariable!!)
    } catch (ex: Exception) {
        println(ex)
    }
}