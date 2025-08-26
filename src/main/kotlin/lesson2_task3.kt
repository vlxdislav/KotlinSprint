fun main() {
    var departureHour : Int = 9
    var departureMinute : Int = 39
    var travelTimeMinutes : Int = 457

    val ArrivalInMinutes = departureHour * 60 + departureMinute + travelTimeMinutes

    val arrivalHour = ArrivalInMinutes / 60
    val arrivalMinute = ArrivalInMinutes % 60

    println("%02d:%02d".format(arrivalHour, arrivalMinute))

}