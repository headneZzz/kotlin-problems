package codewars.kyu6

fun inArray(array1: Array<String>, array2: Array<String>): Array<String> =
    array1.filter { arr1 -> array2.any { arr2 -> arr2.contains(arr1) } }.toSortedSet().toTypedArray()
