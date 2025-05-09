package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

const val ONE = 1
const val TWO = 2

fun getMiddleString(originalString: String): String {
    val length = originalString.length
    if (length == 0) {
        return ""
    }
    return if (length % TWO == 0) originalString.substring(length / TWO - ONE, length / TWO + ONE)
    else originalString[length / TWO].toString()
}
