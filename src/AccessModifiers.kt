
// 1. public class (default visibility)
class PublicClass {
    val publicInfo: String = "Public Info"  // public by default
    private val privateInfo: String = "Private Info"  // private: accessible only inside this class

    fun showPrivateInfo(): String {
        return privateInfo  // privateInfo is accessible within the class
    }
}

// 2. internal class
internal class InternalClass {
    internal val internalInfo: String = "Internal Info"  // internal: visible within the same module
}

// 3. private top-level function (only accessible within this file)
private fun topLevelPrivateFunction() {
    println("This is a private top-level function")
}

// 4. protected class member example
open class ParentClass {
    protected val protectedInfo: String = "Protected Info"  // protected: visible in subclasses
}

class ChildClass : ParentClass() {
    fun getProtectedInfo(): String {
        return protectedInfo  // accessible inside subclass
    }
}

// Testing everything in the `main` function
fun main() {
    // Public class and its public method
    val publicObj = PublicClass()
    println(publicObj.publicInfo)  // Accessing public member
    println(publicObj.showPrivateInfo())  // Accessing private member through public method

    // Internal class and its internal member
    val internalObj = InternalClass()
    println(internalObj.internalInfo)  // Accessible within the same module

    // Private top-level function
    topLevelPrivateFunction()  // Can be accessed as it's within the same file

    // Protected member via subclass
    val childObj = ChildClass()
    println(childObj.getProtectedInfo())  // Accessing protected member through child class
}
