package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val middleOfString = originalString.length / 2
    return when {
        originalString.isEmpty() -> ""
        originalString.length % 2 == 0 -> originalString.substring(middleOfString - 1, middleOfString + 1)
        else -> originalString[middleOfString].toString()
    }
}
