fun main() {

    val initialDeposit = 70000
    val rate = 16.7 / 100
    val years = 20

    val deposit = initialDeposit * Math.pow(1 + rate, years.toDouble())

    println("%.3f".format(deposit))
}