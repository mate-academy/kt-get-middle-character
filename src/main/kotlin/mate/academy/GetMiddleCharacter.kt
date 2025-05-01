package mate.academy

fun getMiddleString(originalString: String): String {
    if (originalString.isEmpty()) return ""

    return if (originalString.length % 2 == 0) {
        originalString.substring(originalString.length / 2 - 1, originalString.length / 2 + 1)
    } else {
        originalString[originalString.length / 2].toString()
    }
}
