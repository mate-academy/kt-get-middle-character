package mate.academy

fun getMiddleString(originalString: String): String {
    val length = originalString.length
    if (length == 0) {
        return ""
    }
    val middle = length / 2
    return if (length % 2 == 0) {
        originalString.substring(middle - 1, middle + 1)
    } else {
        originalString[middle].toString()
    }
}
