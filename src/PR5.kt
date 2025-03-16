fun main() {
    println("Введите число:")
    val n = readlnOrNull()?.toIntOrNull() ?: return
    val result = "$n${n * 2}"
    println(result)
}
