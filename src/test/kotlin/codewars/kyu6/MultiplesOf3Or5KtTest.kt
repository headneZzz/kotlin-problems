package codewars.kyu6

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class MultiplesOf3Or5KtTest {

    @Test
    fun multiplesOf3Or5() {
        assertEquals(23, multiplesOf3Or5(10))
        assertEquals(78, multiplesOf3Or5(20))
        assertEquals(9168, multiplesOf3Or5(200))
    }
}
