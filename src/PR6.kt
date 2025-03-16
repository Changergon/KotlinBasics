fun main() {
    println("Введите ваше имя:")
    val name = readlnOrNull()?.takeIf { it.isNotBlank() } ?: "Гость"

    println("Введите ваш возраст:")
    val age = readlnOrNull()?.toIntOrNull() ?: 0

    println("Привет, $name! Тебе уже $age.")
}
