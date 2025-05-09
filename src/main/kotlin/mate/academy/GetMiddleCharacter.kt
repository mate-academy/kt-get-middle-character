package mate.academy

fun getMiddleString(originalString: String): String {
    if (originalString.isEmpty()) return ""
    val length = originalString.length
    val middle = length / 2
    return if (length % 2 == 0) {
        originalString.substring(middle - 1, middle + 1)
    } else {
        originalString.substring(middle, middle + 1)
    }
}
