package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val size = originalString.length
    return if (size < 2) return originalString
    else if (size % 2 == 0) originalString.slice(size / 2 - 1..size / 2)
    else originalString[(size + 1) / 2].toString()
}
