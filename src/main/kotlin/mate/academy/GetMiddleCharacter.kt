package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    if (originalString.isEmpty()) {
        return ""
    }

    val middle = originalString.length / 2
    return if (originalString.length % 2 == 0) {
        "${originalString[middle - 1]}${originalString[middle]}"
    } else {
        originalString[middle].toString()
    }
}
