package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    if (originalString.isEmpty()) {
        return ""
    }
    if (originalString.length % 2 == 0) {
        val drop: Int = (originalString.length - 2) / 2
        return originalString.drop(drop).dropLast(drop)
    }
    val drop: Int = (originalString.length - 1) / 2
    return originalString.drop(drop).dropLast(drop)
}
