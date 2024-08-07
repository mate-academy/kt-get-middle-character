package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val l = originalString.length
    if (l == 0) return ""
    return if (l % 2 == 0) originalString.substring(l / 2 - 1 .. l / 2)
    else originalString.substring(l / 2 .. l / 2)
}
