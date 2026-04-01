package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val length = originalString.length;

    if (length == 0) return ""

    val mid = length / 2

    return if (length % 2 == 0) {
        originalString.substring(mid - 1, mid + 1)
    } else {
        originalString[mid].toString()
    }
}
