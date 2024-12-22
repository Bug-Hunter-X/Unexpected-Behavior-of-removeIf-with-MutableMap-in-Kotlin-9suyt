fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 3 }
    println(list) // Output: [1, 2, 3]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val keysToRemove = mutableListOf<String>()
    for ((key, value) in map) {
        if (value > 1) {
            keysToRemove.add(key)
        }
    }
    keysToRemove.forEach { map.remove(it) }
    println(map) // Output: {a=1}
} 