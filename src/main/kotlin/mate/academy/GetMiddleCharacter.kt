package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val length = originalString.length
    if (originalString.isEmpty()) return ""
    return if (length.rem(2) == 0) originalString.substring(length.div(2) -1, length.div(2) + 1)
    else originalString[length / 2].toString()
}
