package academy.learnprogramming.fileIO

import java.io.File

fun main() {
//    val lines = File("test.txt").reader().readLines()
//    lines.forEach {
//
//    }

    val fileName = "test.txt"

    println(
        File(fileName).reader().use { it.readText() }
    )

    println (
        File(fileName).reader().forEachLine { line ->
            println(line)
        }
    )

    println (
        File(fileName).reader().useLines { lines ->
            lines.forEach {
                println(it)
            }
        }
    )

}