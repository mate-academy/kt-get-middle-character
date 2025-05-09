package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val length = originalString.length
    return when {
        originalString == "" -> ""
        length % 2 == 0 -> originalString.substring(length / 2 - 1, length / 2 + 1)
        else -> originalString[length / 2].toString()
    }
}
