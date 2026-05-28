package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val len = originalString.length
    if (len == 0) return ""

    val middle = len / 2

    return if (len % 2 == 0) {
        originalString.substring(middle - 1, middle + 1)
    } else {
        originalString.substring(middle, middle + 1)
    }
}
