object Validate {

    fun passwordValidate(password: String) = password.length in 1..9

    fun isNumber(data: Any) = data is Int
}

class ClassUniversal {
    companion object {

        fun create(): ClassUniversal = ClassUniversal()
    }
}

fun main(args: Array<String>) {
    println("Ingresa tu contraseña: ")
    val password: String = readLine() ?: ""

    println(Validate.passwordValidate(password))
    println("------------------------------")

    println("Ingrese un número: ")
    val number: Any = readLine()?.toInt() ?: 0
    println(Validate.isNumber(number))

    val classUniversalInMain = ClassUniversal.create()
}

fun data() {
    val classUniversalData = ClassUniversal.create()
}