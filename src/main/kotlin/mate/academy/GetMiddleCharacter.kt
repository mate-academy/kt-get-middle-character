package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    if (originalString.isEmpty()) return originalString
    return if (originalString.length % 2 == 0)
        originalString[originalString.length / 2 - 1] + originalString[originalString.length / 2].toString()

    else originalString[originalString.length / 2].toString()
}
