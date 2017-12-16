fun main(args: Array<String>) {
    val srt = "Una cadena de String normal"

    val name = "Mabel"
    val age = 25

    val sentence = "Ella es $name y tiene $age años"

    println(sentence)

    val cumpl = "$name cumple ${age + 1}"
    println(cumpl)

    val text = """Este es un string que quiero imprimir,
        |que es demaciado largo
        |y tiene varios renglones.""".trimMargin()
    print(text)
}