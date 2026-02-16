package corporation

fun main() {
    val director = Director(name = "Andrey", age = 25)
    val consultant = Consultant(name = "Max")
    val assistant = Assistant("Helen", 20)
    val accountant = Accountant("Christian", 30)
    val employees = listOf(director, consultant, assistant, accountant)
    for (employee in employees) {
        employee.work()
    }
}