package codewars.kyu6

object PlayPass {

    fun playPass(s: String, n: Int): String {
        val alphabetSize = 26
        var result: String = s
        result = result.mapIndexed { index, char ->
            when {
                char.isLetter() -> {
                    val offset = if (char.isUpperCase()) 'A' else 'a'
                    val shiftedChar = (char.minus(offset).plus(n) % alphabetSize ).plus(offset.code).toChar()
                    if (index % 2 == 0) shiftedChar.uppercaseChar() else shiftedChar.lowercaseChar()
                }
                char.isDigit() -> 9 - char.digitToInt()
                else -> char
            }
        }.reversed().joinToString(separator = "")
        return result
    }
}
