package codewars.kyu6

object EnoughIsEnough {
    fun deleteNth(elements:IntArray, maxOcurrences:Int):IntArray {
        if (maxOcurrences <= 0) {
            return IntArray(0)
        }
        val res: MutableList<Int> = mutableListOf()
        val elementsByOcurrences: MutableMap<Int, Int> = mutableMapOf()
        elements.forEach { element ->
            val ocurrences = elementsByOcurrences.getOrDefault(element, 0)
            if (ocurrences < maxOcurrences) {
                elementsByOcurrences[element] = ocurrences + 1
                res.add(element)
            }
        }
        return res.toIntArray()
    }
}
