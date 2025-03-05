package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val result = mutableSetOf<String>()
    val i = originalString.length
    if (originalString.length == 1) result.add(originalString) else if (originalString.length % 2 != 0) {
        result.add(originalString[i / 2 + 1].toString())
    } else if (originalString.isEmpty()) {
        result.add("")
    } else {
        result.add(originalString[i / 2 - 1].toString())
        result.add(originalString[i / 2].toString())
    }
    return result.joinToString("")
}
