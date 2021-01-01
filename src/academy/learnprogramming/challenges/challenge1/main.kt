package academy.learnprogramming.challenges.challenge1

fun main() {

    // declare two imutable string variables called hello1 and hello2 -- assign hello to both variables... ok...
    val hello1 : String = "hello"
    val hello2 : String = "hello"

    //test whether hello1/hello2 are referentially equal in one line and print
    println(hello1 === hello2)

    // mutable int --> assign  to 2988
    var intTest = 2988

    // immutable of type any and smart cast, then uppercase
    val anything : Any = "testing"
    if (anything is String) println(anything.toUpperCase())

    // one ting of code, print out
    //      1
    //     11
    //    111
    //   1111
    println("""     |     1
                    |    11
                    |   111
                    |  1111
    """.trimMargin()
    )

}