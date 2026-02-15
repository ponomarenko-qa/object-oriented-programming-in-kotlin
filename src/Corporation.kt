fun main() {
    val director = Director(name = "Andrey", age = 25)
    val consultant = Consultant(name = "Max")
    director.getConsultantToWork(consultant)
}