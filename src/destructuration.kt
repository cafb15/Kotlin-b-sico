data class Family(val name: String = "Rodrigo", val age: Int = 24, val colorHair: String = "Cafe")

data class Result(val result: Int, val status: Boolean)

fun calculate(a: Int, b: Int): Result {
    if (a * 2 > b) {
        return Result(a * 2, true)
    } else {
        return Result(a, false)
    }
}

fun main(args: Array<String>) {
    val (name, age, colorHair) = Family()

    println(name)
    println(colorHair)

    println("--------------")
    val (result, status) = calculate(4, 9)

    println("el resultado es $result y el estado es $status")
}