// LambdaExample.kt

fun main() {
    // 1. Basic Lambda Expression
    val greet: (String) -> Unit = { name -> println("Hello, $name!") }
    greet("Alice")  // Output: Hello, Alice!

    // 2. Lambda with Multiple Parameters
    val sum: (Int, Int) -> Int = { a, b -> a + b }
    println(sum(5, 3))  // Output: 8

    // 3. Lambda with Type Inference
    // Kotlin can infer the types of parameters and return type
    val multiply = { a: Int, b: Int -> a * b }
    println(multiply(4, 6))  // Output: 24

    // 4. Lambda as a Function Parameter
    fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    val result = operateOnNumbers(10, 5) { x, y -> x - y }  // Using a lambda for subtraction
    println(result)  // Output: 5

    // 5. Higher-order Function with Lambda
    val numbers = listOf(1, 2, 3, 4, 5)
    val doubledNumbers = numbers.map { it * 2 }  // Using lambda to double each number
    println(doubledNumbers)  // Output: [2, 4, 6, 8, 10]

    // 6. Lambda with Single Expression
    val square: (Int) -> Int = { it * it }
    println(square(7))  // Output: 49

    // 7. Lambda with No Parameters
    val printHello: () -> Unit = { println("Hello, World!") }
    printHello()  // Output: Hello, World!
}
