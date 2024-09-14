// File: Serialization.kt

import kotlinx.serialization.*
import kotlinx.serialization.json.*

// Define a data class for serialization
@Serializable
data class User(val name: String, val age: Int)

fun main() {
    // JSON Serialization and Deserialization

    // Create an instance of User
    val user = User("Alice", 30)

    // Serialize the User object to JSON
    val jsonString = Json.encodeToString(user)
    println("Serialized JSON: $jsonString")

    // Deserialize the JSON back to a User object
    val deserializedUser = Json.decodeFromString<User>(jsonString)
    println("Deserialized User: $deserializedUser")

    // Working with Different Formats

    // XML Serialization (Requires additional libraries, for demonstration purposes)
    // Example placeholder code; actual implementation requires libraries like kotlinx.serialization-xml

    // Placeholder for XML example
    println("For XML serialization, you would use a library like kotlinx.serialization-xml.")
}
// Explanation:
// JSON Serialization and Deserialization:
// Serialization: Json.encodeToString converts a User object to a JSON string.
// Deserialization: Json.decodeFromString converts the JSON string back into a User object.
// Working with Different Formats:
// XML Serialization: While the provided example includes a placeholder, actual XML serialization requires additional libraries such as kotlinx.serialization-xml.
// For both file I/O and serialization, make sure you have the necessary dependencies in your project, such as kotlinx.serialization for JSON serialization. For XML and other formats, you may need additional libraries.