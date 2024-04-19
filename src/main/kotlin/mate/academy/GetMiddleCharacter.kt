package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val size = originalString.length
    if (size < 2) return originalString
    if (size % 2 == 0) return originalString.slice(size / 2 -1..size/2)
    return originalString.get((size + 1) / 2).toString()
}
