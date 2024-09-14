// NullSafetyExample.kt

fun main() {
    // 1. Nullable Types
    var name: String? = "John"  // Nullable String
    println(name)  // Output: John

    name = null  // Can be assigned null
    println(name)  // Output: null

    // 2. Safe Calls
    // Using safe call operator ?. to avoid NullPointerException
    val length: Int? = name?.length  // Safe call, returns null if name is null
    println(length)  // Output: null

    // 3. The Elvis Operator (?:)
    // Provides a default value if the result of a safe call is null
    val lengthOrZero: Int = name?.length ?: 0  // Elvis operator, returns 0 if name?.length is null
    println(lengthOrZero)  // Output: 0

    // 4. The Non-null Assertion Operator (!!)
    // Used to assert that a value is not null
    // Throws an exception if the value is null
    try {
        val nonNullName: String = name!!  // Assertion that name is not null
        println(nonNullName)
    } catch (e: NullPointerException) {
        println("Caught exception: ${e.message}")  // Output: Caught exception: null
    }

    // 5. Safe Casts
    // Using `as?` for safe casting
    val obj: Any = "I am a string"
    val str: String? = obj as? String  // Safe cast, returns null if obj is not a String
    println(str)  // Output: I am a string

    val number: Int? = obj as? Int  // Safe cast, returns null if obj is not an Int
    println(number)  // Output: null
}
