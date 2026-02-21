package profile

class Person(
    private val name: String,
    private val age: Int,
    private val height: Int,
    private val weight: Int
) {

    fun sayHello() {
        println("Hello! My name is $name!")
    }

    fun printInfo() {
        println("Name: $name Age: $age Height: $height Weight: $weight")
    }

    fun run() {
        repeat(10) {
            print("Running...")
        }
        print("\n")
    }
}