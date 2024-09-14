import java.io.File
import java.io.IOException

fun main() {
    // File Reading and Writing

    val fileName = "example.txt"
    val contentToWrite = "Hello, Kotlin file I/O!"

    // Writing to a file
    try {
        File(fileName).writeText(contentToWrite)
        println("Content written to $fileName")
    } catch (e: IOException) {
        println("Error writing to file: ${e.message}")
    }

    // Reading from a file
    try {
        val contentRead = File(fileName).readText()
        println("Content read from $fileName: $contentRead")
    } catch (e: IOException) {
        println("Error reading from file: ${e.message}")
    }

    // Working with File Paths

    val filePath = File(fileName).absolutePath
    println("Absolute file path: $filePath")

    val fileDir = File(fileName).parent
    println("File directory: $fileDir")

    // Using File APIs

    val file = File(fileName)
    if (file.exists()) {
        println("File size: ${file.length()} bytes")
        println("Is file readable: ${file.canRead()}")
        println("Is file writable: ${file.canWrite()}")
        println("Is file executable: ${file.canExecute()}")
    } else {
        println("File does not exist")
    }
}

// Explanation:
// File Reading and Writing:
// Writing to a File: writeText is used to write content to a file. Exceptions are handled using a try-catch block.
// Reading from a File: readText reads the content of a file into a string. Exceptions are handled similarly.
// Working with File Paths:
// Absolute Path: absolutePath retrieves the absolute path of the file.
// File Directory: parent retrieves the directory path of the file.
// Using File APIs:
// File Properties: The File class provides methods to check properties like file size, readability, writability, and executability.