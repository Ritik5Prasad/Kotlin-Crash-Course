fun main() {
    // Defining Functions

    // Simple Function
    fun greet(name: String): String {
        return "Hello, $name!"
    }
    println(greet("Alice"))

    // Function with Multiple Parameters
    fun add(a: Int, b: Int): Int {
        return a + b
    }
    println("Sum: ${add(5, 3)}")

    // Function with a Unit Return Type (No return value)
    fun printMessage(message: String) {
        println(message)
    }
    printMessage("This is a message.")

    // Function Parameters and Return Types

    // Function with a String Return Type
    fun reverseString(input: String): String {
        return input.reversed()
    }
    println("Reversed String: ${reverseString("Kotlin")}")

    // Default and Named Arguments

    // Function with Default Arguments
    fun greetUser(name: String, greeting: String = "Hello"): String {
        return "$greeting, $name!"
    }
    println(greetUser("Bob"))               // Uses default greeting
    println(greetUser("Bob", "Hi"))         // Uses custom greeting

    // Named Arguments
    println(greetUser(name = "Charlie", greeting = "Welcome"))

    // Varargs

    // Function with Varargs
    fun sum(vararg numbers: Int): Int {
        return numbers.sum()
    }
    println("Sum of numbers: ${sum(1, 2, 3, 4, 5)}")

    // Higher-order Functions

    // Higher-order function that takes another function as a parameter
    fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    // Define addition operation
    val addition: (Int, Int) -> Int = { x, y -> x + y }
    println("Addition Result: ${operateOnNumbers(5, 3, addition)}")

    // Use lambda directly
    println("Multiplication Result: ${operateOnNumbers(5, 3) { x, y -> x * y }}")

    // Lambdas and Anonymous Functions

    // Lambda Expression
    val square: (Int) -> Int = { number -> number * number }
    println("Square of 4: ${square(4)}")

    // Anonymous Function
    val multiply = fun(x: Int, y: Int): Int {
        return x * y
    }
    println("Product of 4 and 5: ${multiply(4, 5)}")

    // Function as a Parameter
    fun operateOnString(input: String, transform: (String) -> String): String {
        return transform(input)
    }

    // Using a lambda to transform the string
    val upperCaseString = operateOnString("hello") { it.uppercase() }
    println("Uppercase String: $upperCaseString")
}
// Explanation:
// Defining Functions:
// Simple Function: greet function returns a greeting message.
// Function with Multiple Parameters: add function returns the sum of two numbers.
// Unit Return Type: printMessage does not return a value.
// Function Parameters and Return Types:
// String Return Type: reverseString returns a reversed string.
// Default and Named Arguments:
// Default Arguments: greetUser function uses a default greeting.
// Named Arguments: Allows specifying arguments by name when calling the function.
// Varargs:
// Varargs: sum function accepts a variable number of integer arguments and calculates their sum.
// Higher-order Functions:
// Higher-order Function: operateOnNumbers takes a function as a parameter and applies it to the given numbers.
// Lambdas and Anonymous Functions:
// Lambda Expression: square lambda calculates the square of a number.
// Anonymous Function: multiply performs multiplication without naming the function.
// Function as a Parameter:
// Using Lambda to Transform String: operateOnString applies a transformation function to a string.