package codewars.kyu7

fun highAndLow(numbers: String): String {
    val digits = numbers.split(' ').map { it.toInt() }.sorted()
    return "${digits.last()} ${digits.first()}"
}
