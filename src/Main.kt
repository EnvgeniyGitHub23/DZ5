// Домашнее задание №5 от 15.10.2026

fun main() {
    // ===== 3 коробки с разными типами =====
    val stringBox = Box("Кот", "Пёс", "Котопес")
    val intBox = Box(10, 20, 30)
    val floatBox = Box(1.5f, 2.5f, 3.0f)

    println("Коробка 1 (String): $stringBox")
    println("Коробка 2 (Integer): $intBox")
    println("Коробка 3 (Float): $floatBox")

    // ===== Сумма чисел из всех коробок =====
    val total = sumBoxes(stringBox, intBox, floatBox)
    println("\nСумма всех чисел в коробках: $total")
}