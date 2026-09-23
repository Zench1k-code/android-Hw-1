//first step
/*
fun main() {
    val operatingSystem = "Chrome OS"
    val emailID = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem,emailID))
}

fun displayAlertMessage(a: String, b: String): String {
    return "There's a new sign-in request on $a for your Google Account $b."
}
 */

//second step
fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."

}