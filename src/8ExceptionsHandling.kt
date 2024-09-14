fun main() {
    // Try-Catch Blocks

    // Basic Try-Catch
    try {
        val result = 10 / 0
    } catch (e: ArithmeticException) {
        println("Caught an ArithmeticException: ${e.message}")
    } finally {
        println("This block is always executed, whether an exception is thrown or not.")
    }

    // Multiple Catch Blocks
    try {
        val result = "string".toInt()
    } catch (e: NumberFormatException) {
        println("Caught a NumberFormatException: ${e.message}")
    } catch (e: Exception) {
        println("Caught a general Exception: ${e.message}")
    } finally {
        println("This block is executed after all catch blocks.")
    }

    // Throwing Exceptions

    // Function that throws an exception
    fun checkAge(age: Int) {
        if (age < 0) {
            throw IllegalArgumentException("Age cannot be negative")
        } else {
            println("Age is $age")
        }
    }

    try {
        checkAge(-1)
    } catch (e: IllegalArgumentException) {
        println("Caught an IllegalArgumentException: ${e.message}")
    }

    // Custom Exceptions

    // Define a custom exception class
    class CustomException(message: String) : Exception(message)

    // Function that throws a custom exception
    fun processOrder(orderId: Int) {
        if (orderId <= 0) {
            throw CustomException("Invalid order ID: $orderId")
        } else {
            println("Processing order with ID: $orderId")
        }
    }

    try {
        processOrder(0)
    } catch (e: CustomException) {
        println("Caught a CustomException: ${e.message}")
    }
}

// Explanation:
// Try-Catch Blocks:
// Basic Try-Catch: Handles exceptions thrown within the try block. The catch block catches specific exceptions and handles them. The finally block executes regardless of whether an exception was thrown.
// Multiple Catch Blocks: Demonstrates handling different types of exceptions. If more than one exception type could be thrown, each type can be caught and handled separately.
// Throwing Exceptions:
// Function That Throws an Exception: checkAge throws an IllegalArgumentException if the provided age is negative. This exception is caught and handled in the try-catch block.
// Custom Exceptions:
// Custom Exception Class: CustomException extends the Exception class to create a custom exception with a specific message.
// Function That Throws a Custom Exception: processOrder throws CustomException if the order ID is invalid. This custom exception is then caught and handled.