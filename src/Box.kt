class Box<T1, T2, T3>(
    val item1: T1,
    val item2: T2,
    val item3: T3
) {
    override fun toString(): String {
        return "Box($item1, $item2, $item3)"
    }
}

// == функция для суммирования чисел =
fun sumBoxes(vararg boxes: Box<*, *, *>): Double {
    var sum = 0.0
    for (box in boxes) {
        // Проверяем каждое поле: если  Number, то добавлем
        listOf(box.item1, box.item2, box.item3).forEach { item ->
            if (item is Number) {
                sum += item.toDouble()
            }
        }
    }
    return sum
}