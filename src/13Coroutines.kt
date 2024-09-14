import kotlinx.coroutines.*

// Introduction to Coroutines
fun main() {
    println("Starting main...")

    // Example of launching a coroutine
    runBlocking {
        // Launching a simple coroutine
        launch {
            delay(1000L) // Non-blocking delay for 1 second (1000 milliseconds)
            println("World!")
        }
        println("Hello,") // This will be printed before "World!"
    }

    // Coroutine with suspending functions
    runBlocking {
        println("Starting coroutine with suspending function...")
        val result = fetchData() // This will suspend until fetchData completes
        println("Data fetched: $result")
    }

    // Coroutine Scope and Context
    runBlocking {
        val job = launch(Dispatchers.IO) {
            // This coroutine runs in IO context
            println("Running in context: ${Thread.currentThread().name}")
            delay(500L)
            println("Done with IO work")
        }
        job.join() // Wait for the job to complete
        println("Job completed")
    }

    // Deferred and Await
    runBlocking {
        val deferredResult: Deferred<String> = async {
            delay(1000L)
            "Deferred result"
        }
        println("Deferred result is: ${deferredResult.await()}")
    }

    // Exception Handling in Coroutines
    runBlocking {
        try {
            val result = withTimeoutOrNull(500L) {
                delay(1000L) // This will timeout
                "Result"
            }
            println("Result: $result")
        } catch (e: TimeoutCancellationException) {
            println("Caught timeout exception: ${e.message}")
        }

        val job = launch {
            try {
                delay(1000L)
                throw Exception("Something went wrong!")
            } catch (e: Exception) {
                println("Caught exception in coroutine: ${e.message}")
            }
        }
        job.join() // Wait for the job to complete
    }
}

// Suspending Functions
suspend fun fetchData(): String {
    delay(2000L) // Simulate long-running operation
    return "Fetched Data"
}

// Explanation
// Introduction to Coroutines:
// The main function runs runBlocking, which is a coroutine builder that blocks the main thread until all coroutines inside it complete.
// Suspending Functions:
// fetchData is a suspending function that simulates a long-running operation using delay.
// Launching Coroutines:
// launch creates a new coroutine in the context of runBlocking. The coroutine prints "World!" after a 1-second delay while the main thread prints "Hello," first.
// Coroutine Scopes and Contexts:
// launch with Dispatchers.IO runs the coroutine in an IO context, suitable for I/O-bound tasks. The Dispatchers.IO context is used for background work.
// Deferred and Await:
// async creates a Deferred object that represents a future result. await suspends the coroutine until the result is available.
// Exception Handling in Coroutines:
// withTimeoutOrNull is used to handle timeouts gracefully. launch can catch exceptions thrown within the coroutine, demonstrating coroutine-specific exception handling.
// Running the Code
// To run the above code:

// Ensure Kotlin Coroutines Dependency: Add the following dependency to your build.gradle.kts:

// dependencies {
//     implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.0") // Use the latest version
// }
// Run the Kotlin File: Use your IDE or command line to execute the CoroutinesDemo.kt file.
