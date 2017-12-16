fun main(args: Array<String>) {
    val arrA = intArrayOf(1, 2, 3, 4, 5, 6)
    val arrB = arrayListOf("Hello", "Kotlin", "Android", "etc")

    val num = arrA[0]
    arrA[2] = 10

    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.add(6)
    mutableList.add(5, 6)

    val map = mutableMapOf(Pair("key", 12))
    map.put("key2", 20)
}