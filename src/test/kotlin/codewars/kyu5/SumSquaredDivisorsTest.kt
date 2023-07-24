package codewars.kyu5

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumSquaredDivisorsTest {

    @Test
    fun basicTests() {
        assertEquals("[[42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(42, 250))
        assertEquals("[[1, 1], [42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(1, 250))
    }
}
