package codewars.kyu6

fun multiplesOf3Or5(number: Int): Int {
    if (number < 0) {
        return 0
    }

    return getSumOfProgression(number - 1, 3) + getSumOfProgression(number - 1, 5) - getSumOfProgression(number - 1, 15)
}

fun getSumOfProgression(number: Int, d: Int): Int {
    val ost = number % d
    val lastNum = number - ost
    val n = lastNum / d
    return ((d.toDouble() + number - ost) / 2 * n).toInt()
}
