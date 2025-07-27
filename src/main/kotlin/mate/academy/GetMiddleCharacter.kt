package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    if (originalString.isEmpty()) {
        return ""
    }

    val isEven = originalString.length % 2 == 0

    val startIndex = if (isEven) (originalString.length / 2) - 1 else originalString.length / 2
    val endIndex = if (isEven) startIndex + 2 else startIndex + 1

    return originalString.substring(startIndex, endIndex);
}
