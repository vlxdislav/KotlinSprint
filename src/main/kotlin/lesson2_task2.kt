fun main() {
    val WORKERS = 50
    val WORKERS_SALARY = 30000

    val INTERNS = 30
    val INTERNS_SALARY = 20000

    var calculationForEmployees = WORKERS * WORKERS_SALARY
    var generalExpenses = calculationForEmployees + INTERNS * INTERNS_SALARY
    var averageSalary = generalExpenses/ (WORKERS + INTERNS)

    println(calculationForEmployees)
    println(generalExpenses)
    println(averageSalary)
}