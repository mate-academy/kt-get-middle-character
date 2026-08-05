package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

private const val TWO = 2

private const val ONE = 1

private const val ZERO = 0

fun getMiddleString(originalString: String): String {
    if (originalString.length <= ONE) {
        return originalString
    }
    return if (originalString.length % TWO == ZERO) originalString.substring(
        originalString.length / TWO - ONE,
        originalString.length / TWO + ONE
    ) else originalString[originalString.length / TWO + ONE].toString()
}
