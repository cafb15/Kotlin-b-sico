class Example {

    fun Hello() {
        println("Hello")
    }
}

class Person(name: String) {

    init {
        println(name)
    }

    constructor(name:String, age:Int) : this(name) {
        println("Nombre $name, edad $age")
    }
}

open class Base(private val init:Int) {

    open fun PrintSome() {
        println("Algo $init")
    }
}

class General(private val d:Int) : Base(d) {
    override fun PrintSome() {
        super.PrintSome()
        val addition = 4 + d
    }
}

fun main(args: Array<String>) {
    println(Person("Carlos", 19))
    General(5).PrintSome()
}