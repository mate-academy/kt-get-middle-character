package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val length = originalString.length
    if (length == 0) {
        return ""
    }
    return if (length % 2 == 0) {
        originalString.substring(length / 2 - 1, length / 2 + 1)
    } else {
        originalString.substring(length / 2, length / 2 + 1)
    }
}
