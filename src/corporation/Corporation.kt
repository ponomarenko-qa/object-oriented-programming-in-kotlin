package corporation

fun main() {
    val director = Director(name = "Andrey", age = 25)
    val consultant = Consultant(name = "Max")
    val assistant = Assistant("Helen", 20)
    director.getConsultantToWork(consultant)
    director.takeCoffee(assistant)
}