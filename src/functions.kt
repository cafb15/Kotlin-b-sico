fun main(args: Array<String>) {
    println(higher(4, 9))
    hello()
}

fun hello():Unit {
    println("Hello")
    addition(2, 2)
}

fun addition(a:Int, b:Int) {
    println("$a + $b = ${a + b}")
}

fun higher(a:Int, b:Int): Int = if (a > b) a else b