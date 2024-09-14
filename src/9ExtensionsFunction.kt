// Top-level extension property for Int
val Int.isEven: Boolean
    get() = this % 2 == 0

fun main() {
    // Defining Extension Functions

    // Extension function for the String class
    fun String.isPalindrome(): Boolean {
        return this == this.reversed()
    }

    // Using the extension function
    val word = "radar"
    println("Is '$word' a palindrome? ${word.isPalindrome()}")

    // Using the extension property
    val number = 42
    println("Is $number even? ${number.isEven}")

    // Extension Functions for Standard Library

    // Extension function for the List class to get the second element
    fun <T> List<T>.secondOrNull(): T? {
        return if (this.size > 1) this[1] else null
    }

    // Using the extension function
    val numbers = listOf(1, 2, 3, 4)
    println("The second element of the list is: ${numbers.secondOrNull()}")

    // Using the extension function on an empty list
    val emptyList = listOf<Int>()
    println("The second element of the empty list is: ${emptyList.secondOrNull()}")
}

// Explanation:
// Defining Extension Functions:
// Extension Function for String: isPalindrome is defined as an extension function for the String class. It checks if a string is a palindrome by comparing it to its reversed version.
// Extension Properties:
// Extension Property for Int: isEven is defined as an extension property for the Int class. It determines if an integer is even by checking if it is divisible by 2.
// Extension Functions for Standard Library:
// Extension Function for List: secondOrNull is an extension function for the List class. It returns the second element of the list or null if the list does not have a second element.