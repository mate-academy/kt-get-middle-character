package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    var middleString = ""
    val length = originalString.length
    if (length % 2 == 0 && length != 0) middleString = originalString.substring(length / 2 - 1, length / 2 + 1)
    if (length % 2 != 0) middleString = originalString.substring(length / 2, length / 2 + 1)
    return middleString
}
