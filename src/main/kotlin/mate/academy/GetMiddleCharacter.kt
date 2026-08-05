package mate.academy

const val DIVIDER = 2
const val ONE = 1
const val ZERO = 0

fun getMiddleString(originalString: String): String {

    if (originalString.isEmpty()) {
        return ""
    }

    val length: Int = originalString.length
    val middle: Int = length / DIVIDER

    return if (length % DIVIDER == ZERO) {
        originalString.substring(middle - ONE, middle + ONE)
    } else {
        originalString.substring(middle, middle + ONE)
    }
}
