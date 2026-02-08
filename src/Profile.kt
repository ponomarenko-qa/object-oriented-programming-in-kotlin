fun main() {
    val first = Person()
    val second = Person()

    print("Input 1st name: ")
    first.name = readln()

    print("Input 2nd name: ")
    second.name = readln()

    print("Input 1st age: ")
    first.age = readln().toInt()

    print("Input 2nd age: ")
    second.age = readln().toInt()

    print("Input 1st height: ")
    first.height = readln().toInt()

    print("Input 2nd height: ")
    second.height = readln().toInt()

    print("Input 1st weight: ")
    first.weight = readln().toInt()

    print("Input 2nd weight: ")
    second.weight = readln().toInt()

    println("1. Name: ${first.name}\nAge: ${first.age}\nHeight: ${first.height}\nWeight: ${first.weight}")
    println("2. Name: ${second.name}\nAge: ${second.age}\nHeight: ${second.height}\nWeight: ${second.weight}")
}