fun type(data: Any) {

    when(data) {
        is String -> println(data.length)
        is Int -> println("${data * 2}")
        is Boolean -> println("Es un boleano $data")
        is Person2 -> println("${data.name} ${data.age}")
        else -> println("No es ninguno de estos tipos de datos.")
    }
}

fun whoIs(person: Person2) {

    when(person.name) {
        "Mabel", "María", "Juan", "Raúl" -> println("Puedes abrir la puerta")
        else -> println("Corre de la casa!!!")
    }
}

fun range(num:Int) {

    when(num) {
        in 1 until 10 -> println("Este es un número positivo entre 1 y 10")
        in 10..100 -> println("Este es un número positivo entre 10 y 100")
        else -> println("Está fuera del rango definido")
    }
}

fun main(args: Array<String>) {
    type(3)
    println("---------------------------")
    whoIs(Person2("Mabel", 12, "cafes"))
    whoIs(Person2("Pepe", 12, "cafes"))
    println("---------------------------")
    range(10)
}