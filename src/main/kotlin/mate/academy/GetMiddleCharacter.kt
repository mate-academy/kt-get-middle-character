package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

private const val ZERO = 0
private const val ONE = 1
private const val TWO = 2

fun getMiddleString(originalString: String): String {
    if (originalString.length == ZERO) {
        return ""
    }

    var middleIndex = originalString.length / TWO

    return if (originalString.length % TWO == ZERO) originalString.substring(middleIndex - ONE, middleIndex + ONE)
           else originalString.substring(middleIndex, middleIndex + ONE)
}
