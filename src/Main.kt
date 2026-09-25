fun compareScreenTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

fun main() {
    println(compareScreenTime(timeSpentToday = 300, timeSpentYesterday = 250))
    println(compareScreenTime(timeSpentToday = 300, timeSpentYesterday = 300))
    println(compareScreenTime(timeSpentToday = 200, timeSpentYesterday = 220))
}