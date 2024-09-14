fun main() {
    // Conditional Statements

    // If Statement
    val number = 15
    if (number > 10) {
        println("$number is greater than 10")
    } else if (number == 10) {
        println("$number is equal to 10")
    } else {
        println("$number is less than 10")
    }

    // When Statement (Kotlin's version of switch-case)
    val dayOfWeek = 3
    val dayName = when (dayOfWeek) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    println("Day $dayOfWeek is $dayName")

    // Loops

    // For Loop
    println("For Loop:")
    for (i in 1..5) {  // Range from 1 to 5 (inclusive)
        println("Number: $i")
    }

    // For Loop with Step
    println("For Loop with Step:")
    for (i in 1..10 step 2) {  // Range from 1 to 10 with step of 2
        println("Number: $i")
    }

    // For Loop with DownTo
    println("For Loop with DownTo:")
    for (i in 5 downTo 1) {  // Range from 5 to 1 (inclusive)
        println("Number: $i")
    }

    // While Loop
    println("While Loop:")
    var counter = 0
    while (counter < 5) {
        println("Counter: $counter")
        counter++  // Increment counter
    }

    // Do-While Loop
    println("Do-While Loop:")
    var anotherCounter = 0
    do {
        println("Another Counter: $anotherCounter")
        anotherCounter++  // Increment anotherCounter
    } while (anotherCounter < 5)

    // Break and Continue

    // Using Break
    println("Break Statement:")
    for (i in 1..10) {
        if (i == 6) {
            println("Breaking loop at $i")
            break
        }
        println("Number: $i")
    }

    // Using Continue
    println("Continue Statement:")
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue  // Skip even numbers
        }
        println("Odd Number: $i")
    }
}
// Explanation:
// Conditional Statements:
// if checks a condition and executes the associated block of code.
// when is a replacement for switch in other languages, providing a more flexible way to handle multiple cases.
// Loops:
// For Loop: Iterates over a range or collection. The step keyword can be used to specify increments, and downTo is used to iterate in reverse.
// While Loop: Continues to execute as long as the condition is true.
// Do-While Loop: Executes at least once and continues while the condition is true.
// Break and Continue:
// Break: Exits the loop immediately.
// Continue: Skips the current iteration and proceeds with the next iteration.
