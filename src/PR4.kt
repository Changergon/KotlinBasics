fun main() {
    val totalDays = 2642
    val years = totalDays / 365
    val weeks = (totalDays % 365) / 7
    val days = (totalDays % 365) % 7

    println("$totalDays дня это - $years лет, $weeks недель и $days дня.")
}
