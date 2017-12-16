fun greet(salute: String = "Hello everyone") {
    println(salute)
}

fun otherFunction(age: Int = 0, adult: Boolean = false, haveClothes: Boolean = true) {
    println("Tiene $age, es $adult y tiene $haveClothes")
}

data class Pl(val a:Int = 2)

fun main(args: Array<String>) {
    greet("Hello Hackspace")
    greet()

    println("----------------------")

    otherFunction(adult = true, age = 19, haveClothes = true)
    otherFunction(19, true, true)
    otherFunction()

    println("----------------------")
    println(Pl())
}