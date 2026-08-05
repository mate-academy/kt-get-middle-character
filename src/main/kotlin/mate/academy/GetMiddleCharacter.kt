package mate.academy
const val NUMBER_TWO = 2
// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val lengthStr = originalString.length
    val middle = lengthStr / NUMBER_TWO
    return when {
        lengthStr == 0 -> ""
        lengthStr % NUMBER_TWO == 0 -> originalString.substring(middle - 1, middle + 1)
        else -> originalString.substring(middle, middle + 1)
    }
}
