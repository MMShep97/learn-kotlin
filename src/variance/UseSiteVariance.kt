package variance

import academy.learnprogramming.collectionslambdas.Car

class UseSiteVariance {
}

fun main() {
    val cars1 = mutableListOf(
            Car("", 1)
    )

    val cars2 = mutableListOf(
            Car("", 2)
    )

    val fords1 = mutableListOf(
            Ford()
    )

    copyCars(fords1, cars1)
}

// allows (ex. type car or any of it's sub classes to read from source)
fun <T> copyCars(source: MutableList<out T>, destination: MutableList<T>) {
    for (car in source) {
        destination.add(car)
    }
}

class Ford: Car("Ford", 2222)
class Toyota: Car("Toyota", 2222)