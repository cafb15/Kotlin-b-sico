fun main(args: Array<String>) {
    "Hello my name is Carlos".print()
    println(4.multiply(2))
    println(4 multiply 5)

    val listNames = mutableListOf("Zelt", "Rodrigo", "Amauri", "Carlos", "Juan")
    listNames.swap(0, 2)
    println(listNames.toString())
}

fun <T> MutableList<T>.swap(index:Int, value:Int) {
    val tmp = this[index]
    this[index] = this[value]
    this[value] = tmp
}

infix fun Int.multiply(num: Int): Int {
    return this * num
}

fun String.print() {
    println(this)
}