package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    if (originalString.length <= 2) {
        return originalString
    }
    val midIndex = originalString.length / 2
    return if (originalString.length % 2 == 0) {
        originalString.substring(midIndex - 1, midIndex + 1)
    } else {
        originalString.substring(midIndex, midIndex + 1)
    }
}
