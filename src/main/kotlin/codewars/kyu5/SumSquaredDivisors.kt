package codewars.kyu5

import kotlin.math.sqrt

object SumSquaredDivisors {

    fun listSquared(m: Long, n: Long): String {
        val result = mutableListOf<List<Long>>()
        for (x in m..n) {
            val divisors = findDivisors(x)
            val divisorsSquaredSum = divisors.sumOf { it * it }
            val sqrt = sqrt(divisorsSquaredSum.toDouble())
            if (sqrt % 1 == 0.0) {
                result.add(listOf(x, divisorsSquaredSum))
            }
        }
        println(findDivisors(m))
        return result.joinToString(prefix = "[", postfix = "]")
    }

    fun findDivisors(number: Long): List<Long> {
        require(number >= 1) { "Number must be greater than or equal to 1." }

        val divisors = mutableListOf<Long>()
        var i = 1L

        while (i * i <= number) {
            if (number % i == 0L) {
                divisors.add(i)
                if (i != number / i) {
                    divisors.add(number / i)
                }
            }
            i++
        }

        return divisors.sorted()
    }
}
