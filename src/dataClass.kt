data class Car(var brand:String, private var doors:Int) {
    var numDoors = doors
        get() {
            return if (field > 0) field else 1
        }

    var maxDoors = doors
        get() {
            return if (field > 0) 1 else field
        }
}

data class Person2(var name:String, val age:Int, val eyesColor:String)

fun main(args: Array<String>) {
    val car = Car("Ford", 4)
    println(car.brand)
    println(car.toString())
    println(car.numDoors)
    println(car.maxDoors)
    println("----------------")
    car.numDoors = 32
    println(car.numDoors)
    println("----------------")

    val mabel = Person2("Mabel", 24, "Cafes")
    val marla = mabel.copy("Marla")

    println(mabel)
    println(marla)

    println("----------------")

    val darla = mabel
    darla.name = "Darla"

    println(mabel)
    println(marla)
    println(darla)
}