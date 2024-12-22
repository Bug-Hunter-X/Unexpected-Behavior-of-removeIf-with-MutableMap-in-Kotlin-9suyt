fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 3 }
    println(list) // Output: [1, 2, 3]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    map.removeIf { it.value > 1 }
    println(map) // Output: {a=1}
}