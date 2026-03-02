package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    if (originalString == "") return ""
    val mid: Int = originalString.length / 2
    return (if (originalString.length % 2 == 0) originalString[mid - 1]
            else "").toString() + originalString[mid]
}
