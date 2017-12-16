fun main(args: Array<String>) {

    var a: String = "abc"
//    a = null

    var b: String? = "abc"

    b = null

    val lA = a.length
    val lB = b?.length ?: 0

    println(lA)
    println(lB)

    println("-----------------------")

    val person: Person2? = Person2("Carlos", 19, "negros")

    val name = person?.name

    //It's executed as long as the object or the variable aren't null.
    person?.let { println("Este es un let.") }
}