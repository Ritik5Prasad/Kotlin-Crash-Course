// Defining Classes

// Simple Class
class Person(val name: String, var age: Int) {
    // Method
    fun introduce() {
        println("Hi, I'm $name and I'm $age years old.")
    }
}

// Properties and Methods
class Rectangle(var width: Double, var height: Double) {
    // Property with custom getter
    val area: Double
        get() = width * height

    // Method to calculate perimeter
    fun perimeter(): Double {
        return 2 * (width + height)
    }
}

// Constructors
class Circle(val radius: Double) {
    // Method to calculate area
    fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Cylinder(val radius: Double, val height: Double) {
    constructor(radius: Double) : this(radius, 1.0)  // Default height to 1.0

    // Method to calculate volume
    fun volume(): Double {
        return Math.PI * radius * radius * height
    }
}

// Inheritance and Interfaces

// Base Class
open class Animal(val name: String) {
    open fun makeSound() {
        println("$name makes a sound.")
    }
}

// Derived Class
class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name barks.")
    }
}

// Interface
interface Shape {
    fun draw()
}

// Implementing Interface
class Triangle : Shape {
    override fun draw() {
        println("Drawing a triangle.")
    }
}

// Data Classes
data class User(val username: String, val email: String) {
    fun displayInfo() {
        println("User: $username, Email: $email")
    }
}

// Object Expressions and Declarations

// Object Declaration
object DatabaseConfig {
    val url: String = "jdbc:mysql://localhost:3306/mydatabase"
    fun connect() {
        println("Connecting to $url")
    }
}

fun main() {
    // Testing Simple Class
    val person = Person("Alice", 30)
    person.introduce()

    // Testing Properties and Methods
    val rectangle = Rectangle(5.0, 3.0)
    println("Area of Rectangle: ${rectangle.area}")
    println("Perimeter of Rectangle: ${rectangle.perimeter()}")

    // Testing Constructors
    val circle = Circle(5.0)
    println("Area of Circle: ${circle.area()}")

    val cylinder = Cylinder(5.0, 10.0)
    println("Volume of Cylinder: ${cylinder.volume()}")

    // Testing Inheritance and Interfaces
    val dog = Dog("Buddy")
    dog.makeSound()

    val triangle = Triangle()
    triangle.draw()

    // Testing Data Class
    val user = User("john_doe", "john.doe@example.com")
    println(user)
    user.displayInfo()

    // Testing Object Declaration
    DatabaseConfig.connect()

    // Testing Object Expression
    val anonymousObject = object {
        val message: String = "This is an anonymous object"
        fun printMessage() {
            println(message)
        }
    }
    anonymousObject.printMessage()
}


// Explanation:
// Defining Classes:
// Simple Class: Person class with properties name and age, and a method introduce.
// Properties and Methods:
// Rectangle Class: Contains properties and methods, including a custom getter for area and a method perimeter.
// Constructors:
// Primary Constructor: Circle class with a primary constructor.
// Secondary Constructor: Cylinder class with a secondary constructor that sets a default height.
// Inheritance and Interfaces:
// Base Class and Derived Class: Animal is a base class, and Dog is a derived class that overrides makeSound.
// Interface: Shape interface with a draw method implemented by Triangle.
// Data Classes:
// Data Class: User class with automatic toString, equals, hashCode, and copy methods.
// Object Expressions and Declarations:
// Object Declaration: DatabaseConfig is a singleton object.
// Object Expression: Creates an anonymous object with properties and methods.
