package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    var result: String = ""
    if (originalString == "") {
        return result
    }

    if (originalString.length % 2 == 0) {
        result = originalString.substring(originalString.length / 2 - 1, originalString.length / 2 + 1)
    } else {
        result = originalString[originalString.length / 2].toString()
    }
    return result
}
