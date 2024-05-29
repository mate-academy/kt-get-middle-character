package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

const val DIVIDER: Int = 2
fun getMiddleString(originalString: String): String {
    val len: Int = originalString.length;
    if (len == 0) return originalString
    return if (len % DIVIDER == 0) originalString.substring(len / DIVIDER - 1, len / DIVIDER + 1)
    else originalString[len / DIVIDER].toString()
}
