package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    if (originalString.isEmpty()) return ""
    val str: Int = originalString.length / 2
    val num = originalString.length % 2
    val str1 = if (num == 0) originalString[str - 1] + originalString[str].toString() else originalString[str]
    return str1.toString()
}
