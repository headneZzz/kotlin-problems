package codewars.kyu5


fun incrementString(str: String): String {
    if (str.isBlank()) {
        return "1"
    }
    if (str[str.length - 1].isLetter()) {
        return str + 1
    }
    var currentIndex = str.length - 1
    var currentDigit = str[currentIndex]
    var resultDigit = ""
    while (currentDigit == '9') {
        resultDigit += "0"
        currentIndex--
        if (currentIndex == -1) {
            break
        }
        currentDigit = str[currentIndex]
    }
    if (currentIndex == -1) {
        return "1$resultDigit"
    }
    if (currentDigit.isLetter()) {
        resultDigit = "1$resultDigit"
        currentIndex++
    } else {
        resultDigit = currentDigit.inc() + resultDigit
    }
    return str.substring(0, currentIndex) + resultDigit
}
