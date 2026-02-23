package corporation

import kotlin.random.Random

class Consultant(
    id: Int,
    name: String,
    age: Int = 0
): Worker(id = id, name = name, age = age, Position.CONSULTANT), Cleaner {

    override fun work() {
        serveCustomers()
    }

    override fun clean() {
        println("My position is Consultant. I'm cleaning workplace...")
    }

    fun serveCustomers(): Int {
        val count = Random.nextInt(0, 100)
        repeat(count) {
            print("The customer is served... ")
        }
        println()
        return count
    }

    fun sayHello() {
        print("Hello! My name is $name.")
        if (age > 0) {
            print(" I'm $age years old.\n")
        }
    }
}