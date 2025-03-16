fun main() {
    println("Введите число из 4 цифр:")
    val input = readlnOrNull() ?: ""

    if (input.length == 4 && input.all { it.isDigit() }) {
        val result = input.toCharArray().joinToString(", ")
        println(result)
    } else {
        println("Пожалуйста, введите число из 4 цифр.")
    }
}
