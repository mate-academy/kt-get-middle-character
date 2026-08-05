package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val length = originalString.length
    val middleIndex = length / 2
    return if (length == 0) "" else if (length % 2 == 1) originalString[middleIndex].toString()
        else originalString.substring(middleIndex - 1, middleIndex + 1)
}
