package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val size = originalString.length
    return when {
        size == 0 -> originalString
        size % 2 == 0 -> originalString.substring(size / 2 - 1, size / 2 + 1)
        else -> originalString.substring(size / 2, size / 2 + 1)
    }
}
