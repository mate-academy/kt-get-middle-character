package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    if (originalString.length <= 2) {
        return originalString;
    }
    val middleIndex = originalString.length / 2
    return if (originalString.length % 2 == 0) {
        originalString.substring(middleIndex - 1, middleIndex + 1)
    } else {
        originalString.substring(middleIndex, middleIndex + 1)
    }
}
