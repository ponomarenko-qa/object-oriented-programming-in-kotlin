package cats

fun main() {
    val cat = Cat("Sam")
    val lion = Lion(countInPride = 25)
    val animals = listOf<CatsFamily>(cat, lion)
    for (animals in animals) {
        animals.eat()
    }
}