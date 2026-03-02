package mate.academy

const val ZERO = 0
const val ONE = 1
const val TWO = 2

fun getMiddleString(originalString: String): String {
    val size = originalString.length
    val result = when {
        size == ZERO -> ""
        size % TWO == ZERO -> originalString.substring(size / TWO - ONE, size / TWO + ONE)
        else -> originalString[size / TWO].toString()
    }
    return result
}
