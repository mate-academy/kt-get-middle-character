package mate.academy
// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string
const val ZERO = 0
const val ONE = 1
const val TWO = 2
const val EMPTY_STRING = ""

fun getMiddleString(originalString: String): String {
    val value = when {
        originalString.isEmpty() -> EMPTY_STRING
        originalString.length % TWO != ZERO -> originalString[originalString.length / TWO].toString()
        else -> originalString.substring((originalString.length / TWO) - ONE, (originalString.length / TWO) + ONE)
    }
    return value
}
