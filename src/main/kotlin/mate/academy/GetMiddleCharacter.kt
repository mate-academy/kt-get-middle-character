package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val stringLength = originalString.length
    if (stringLength == 0) {
        return ""
    }
    val middleIndex: Int = stringLength / 2
    return if (stringLength % 2 == 1) originalString.substring(
        middleIndex,
        middleIndex + 1
    ) else originalString.substring(middleIndex - 1, middleIndex + 1)
}
