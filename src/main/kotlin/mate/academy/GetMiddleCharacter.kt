package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    if (originalString.isEmpty()) return ""
    val mid = originalString.length / 2
    return if (originalString.length % 2 == 0) originalString.substring(mid - 1, mid + 1)
        else originalString.substring(mid, mid + 1)
}
