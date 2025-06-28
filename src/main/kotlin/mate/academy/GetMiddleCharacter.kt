package mate.academy

fun getMiddleString(originalString: String): String {
    if (originalString.isEmpty()) {
        return ""
    }

    val middle = originalString.length / 2
    return if (originalString.length % 2 == 0) {
        originalString.substring(middle - 1, middle + 1)
    } else {
        originalString[middle].toString()
    }
}
