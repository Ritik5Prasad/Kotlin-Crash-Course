fun main() {
    // Lists

    // Immutable List
    val immutableList = listOf("Apple", "Banana", "Cherry")
    println("Immutable List: $immutableList")

    // Mutable List
    val mutableList = mutableListOf("Dog", "Cat")
    mutableList.add("Bird")
    mutableList.remove("Cat")
    println("Mutable List: $mutableList")

    // Sets

    // Immutable Set
    val immutableSet = setOf(1, 2, 3, 4, 5)
    println("Immutable Set: $immutableSet")

    // Mutable Set
    val mutableSet = mutableSetOf("Red", "Green", "Blue")
    mutableSet.add("Yellow")
    mutableSet.remove("Green")
    println("Mutable Set: $mutableSet")

    // Maps

    // Immutable Map
    val immutableMap = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    println("Immutable Map: $immutableMap")

    // Mutable Map
    val mutableMap = mutableMapOf("name" to "Alice", "age" to 30)
    mutableMap["age"] = 31
    mutableMap["city"] = "New York"
    println("Mutable Map: $mutableMap")

    // Iterating over Collections

    // Iterating over List
    println("Iterating over List:")
    for (item in mutableList) {
        println(item)
    }

    // Iterating over Set
    println("Iterating over Set:")
    for (item in mutableSet) {
        println(item)
    }

    // Iterating over Map
    println("Iterating over Map:")
    for ((key, value) in mutableMap) {
        println("Key: $key, Value: $value")
    }

    // Generics and Type Parameters

    // Generic Function
    fun <T> printElements(elements: List<T>) {
        for (element in elements) {
            println(element)
        }
    }

    printElements(listOf(1, 2, 3))          // Works with integers
    printElements(listOf("A", "B", "C"))    // Works with strings

    // Generic Class
    class Box<T>(private var content: T) {
        @JvmName("getContent") // Specify a unique JVM name to avoid clashes
        fun getContent(): T {
            return content
        }
    }

    val intBox = Box(123)
    val stringBox = Box("Hello, Generics!")

    println("Integer Box contains: ${intBox.getContent()}")
    println("String Box contains: ${stringBox.getContent()}")
}

// Explanation:
// Lists:
// Immutable List: Created using listOf, which cannot be modified after creation.
// Mutable List: Created using mutableListOf, which supports modifications like adding or removing items.
// Sets:
// Immutable Set: Created using setOf, which does not allow modifications.
// Mutable Set: Created using mutableSetOf, allowing modifications.
// Maps:
// Immutable Map: Created using mapOf, which is read-only.
// Mutable Map: Created using mutableMapOf, allowing updates to the map.
// Iterating over Collections:
// Demonstrates how to iterate over lists, sets, and maps using for loops.
// Generics and Type Parameters:
// Generic Function: printElements is a function that accepts a list of any type.
// Generic Class: Box is a class that holds a value of any type, demonstrating how generics work in classes.