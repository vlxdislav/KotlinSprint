fun main() {

    val TOTAL_SECONDS : Int = 6480
    val SECONDS_IN_MINUTE = 60

    val hours = TOTAL_SECONDS / (SECONDS_IN_MINUTE * SECONDS_IN_MINUTE)
    val secondsAfterHours = TOTAL_SECONDS % (SECONDS_IN_MINUTE * SECONDS_IN_MINUTE)
    val minutes = secondsAfterHours / SECONDS_IN_MINUTE
    val seconds = secondsAfterHours % SECONDS_IN_MINUTE

    println("%02d:%02d:%02d".format(hours, minutes, seconds))

}
