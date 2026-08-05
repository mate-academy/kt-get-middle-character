package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val length = originalString.length;
    if (length == 0) {
        return "";
    }
    val middle = length / 2;
    return if (length % 2 == 0) {
        originalString.slice(middle - 1..middle)
    } else {
        originalString[middle].toString()
    }
}
