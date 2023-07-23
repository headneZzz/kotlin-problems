package codewars.kyu6

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PlayPassTest {

    @Test
    fun basicTests() {
        assertEquals("!!!VpZ FwPm j ", PlayPass.playPass(" I LOVE YOU!!!", 1))
        assertEquals("!!!uOy eVoL I", PlayPass.playPass("I LOVE YOU!!!", 0))
        assertEquals("zDdCcBbB", PlayPass.playPass("AAABBCCY", 1))
        assertEquals("!4897 Oj oSpC", PlayPass.playPass("BORN IN 2015!", 1))
        assertEquals("!4897 Oj oSpA", PlayPass.playPass("ZORN IN 2015!", 1))
    }
}
