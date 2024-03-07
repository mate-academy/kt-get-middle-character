package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val middleString = originalString.length / 2
    if (originalString.isBlank()) {
        return ""
    }
    return if (originalString.length % 2 == 0) {
        originalString.substring(middleString - 1, middleString + 1)
    } else {
        originalString[middleString].toString()
    }
}
