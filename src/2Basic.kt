const val PI: Double = 3.14159


fun main() {
    // Kotlin Basic Syntax

    // Variables
    var mutableVariable: Int = 10  // Mutable variable
    val immutableVariable: String = "Hello, Kotlin!"  // Immutable variable

    println("Mutable Variable: $mutableVariable")
    println("Immutable Variable: $immutableVariable")

    // Data Types
    // Kotlin has several basic data types

    // Integers
    val intValue: Int = 42
    val longValue: Long = 100000L

    // Floating-point numbers
    val floatValue: Float = 3.14F
    val doubleValue: Double = 3.14159

    // Characters
    val charValue: Char = 'K'

    // Boolean
    val boolValue: Boolean = true

    println("Integer Value: $intValue")
    println("Long Value: $longValue")
    println("Float Value: $floatValue")
    println("Double Value: $doubleValue")
    println("Char Value: $charValue")
    println("Boolean Value: $boolValue")

    // Constants and Literals
    // Constants
   
    // Literals
    val integerLiteral: Int = 100  // Integer literal
    val stringLiteral: String = "Kotlin is fun!"  // String literal

    println("Constant PI: $PI")
    println("Integer Literal: $integerLiteral")
    println("String Literal: $stringLiteral")

    // Operators
    // Arithmetic Operators
    val a: Int = 10
    val b: Int = 5
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a / b
    val remainder = a % b

    println("Sum: $sum")
    println("Difference: $difference")
    println("Product: $product")
    println("Quotient: $quotient")
    println("Remainder: $remainder")

    // Relational Operators
    val isEqual = a == b
    val isNotEqual = a != b
    val isGreater = a > b
    val isLess = a < b
    val isGreaterOrEqual = a >= b
    val isLessOrEqual = a <= b

    println("Is Equal: $isEqual")
    println("Is Not Equal: $isNotEqual")
    println("Is Greater: $isGreater")
    println("Is Less: $isLess")
    println("Is Greater or Equal: $isGreaterOrEqual")
    println("Is Less or Equal: $isLessOrEqual")

    // Logical Operators
    val andOperation = (a > 0) && (b > 0)  // Logical AND
    val orOperation = (a > 0) || (b < 0)   // Logical OR
    val notOperation = !(a < b)            // Logical NOT

    println("Logical AND: $andOperation")
    println("Logical OR: $orOperation")
    println("Logical NOT: $notOperation")
}
// This file includes:

// Basic Syntax: fun main() is the entry point of the Kotlin program.
// Variables: var and val are used to declare mutable and immutable variables, respectively.
// Data Types: Shows how to declare variables of different types.
// Constants and Literals: Demonstrates the use of constants and literals.
// Operators: Covers arithmetic, relational, and logical operators.