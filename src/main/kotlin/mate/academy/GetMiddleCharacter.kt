package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string
const val EMPTY_STRING = ""

fun getMiddleString(originalString: String): String {
    val length: Int = originalString.length
    return when {
        length == 0 -> EMPTY_STRING
        length %2 == 0 -> originalString.substring(startIndex = length / 2 - 1, endIndex = length / 2 + 1)
        else -> originalString.get(index = length / 2).toString()
    }
}
