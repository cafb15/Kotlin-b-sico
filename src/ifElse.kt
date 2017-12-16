fun main(args: Array<String>) {
    val a = isHigher(6)

    defineType(13.2)
    defineType("Hey hello!!!!")
    defineType(Person2("Carlos", 19, "Negros"))
}

fun isHigher(data:Int): Boolean =
    if (data > 0) {
        println("$data")
        true
    } else {
        false
    }

fun defineType(data: Any) {
    if (data is String) {
        println(data.length)
    } else if (data is Int) {
        println("${data * 2}")
    } else if (data is Double) {
        println("$data")
    } else if (data is Person2) {
        println(data.name)
    }
}