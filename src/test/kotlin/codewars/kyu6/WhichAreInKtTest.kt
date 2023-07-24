package codewars.kyu6

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class WhichAreInKtTest {
    @Test
    fun testFixed() {
        val a2 = arrayOf<String>("lively", "alive", "harp", "sharp", "armstrong")
        assertArrayEquals(arrayOf<String>("live", "strong"), inArray(arrayOf<String>("xyz", "live", "strong"), a2))
        assertArrayEquals(arrayOf<String>("arp", "live", "strong"), inArray(arrayOf<String>("live", "strong", "arp"), a2))
        assertArrayEquals(arrayOf<String>(), inArray(arrayOf<String>("tarp", "mice", "bull"), a2))

        assertArrayEquals(
            arrayOf("ou", "ve"),
            inArray(
                arrayOf("oes", "ou", "ion", "ou", "ve"),
                arrayOf("sample;", "have", "have", "you", "ruby-doc.", "input", "have", "answer", "apidock", "not", "Ruby,", "best", "using", "you", "should", "have", "pointed", "not")
            )
        )
    }
}
