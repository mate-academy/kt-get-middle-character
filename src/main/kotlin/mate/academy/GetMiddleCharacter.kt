package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val res = when {
        originalString.isEmpty() -> ""
        originalString.length % 2 != 0 -> originalString[originalString.length / 2].toString()
            else -> originalString
                .substring(originalString.length / 2 - 1,originalString.length / 2 + 1)
                .toString()
    }
    return res
}
