package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string
//sssss

fun getMiddleString(originalString: String): String {
    if (originalString.isEmpty()) {
        return ""
    }
    val middle = originalString.length / 2
    if (originalString.length % 2 == 0) {
        return originalString[middle - 1].toString() + originalString[middle].toString()
    }
    return originalString[middle].toString()
}
