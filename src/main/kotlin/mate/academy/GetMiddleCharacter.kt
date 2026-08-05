package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

private const val TWO = 2
private const val ONE = 1

fun getMiddleString(originalString: String): String {
    if (originalString.isEmpty()) return ""
    val len = originalString.length
    val middle = len / TWO
    return if (len % TWO == 0) {
        originalString.substring(middle - ONE, middle + ONE)
    } else {
        originalString[middle].toString()
    }
}

