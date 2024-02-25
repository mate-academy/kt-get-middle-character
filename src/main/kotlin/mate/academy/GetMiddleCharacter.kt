package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    if (originalString.length % 2 == 0 && originalString != "") {
        return originalString.substring(originalString.length / 2 - 1, originalString.length / 2 + 1)
    }
    return originalString[originalString.length / 2].toString()
}
