fun main(args: Array<String>) {
    val listNumbers = intArrayOf(1, 2, 3, 4, 5, 6)

    for (i in listNumbers.indices) {
        println(listNumbers[i])
    }

    println("---------------")

    val fruits = listOf("Manzana", "piña", "uvas", "plátano")

    for (fruit in fruits) {
        println(fruit)
    }

    println("---------------")

    var x = 3
    while (x > 0) {
        println("${x--}")
    }

    println("---------------")

    var addition = 0
    var input: String?

    do {
        println("Ingresa un número")
        input = readLine()
        addition += input?.toInt() ?: 0
    } while (input != "0")

    println("La suma es: $addition")
}