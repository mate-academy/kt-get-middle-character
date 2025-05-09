package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val length = originalString.length
    val middleIndex = length.div(2)
    return when {
        originalString.isEmpty() -> ""
        length % 2 != 0 -> originalString[middleIndex].toString()
        else -> originalString.substring(middleIndex - 1, middleIndex + 1)
    }
}
