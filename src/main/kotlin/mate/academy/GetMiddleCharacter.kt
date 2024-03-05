package mate.academy

fun getMiddleString(originalString: String): String {
    val middleIndex = originalString.length / 2
    return if (originalString.isEmpty()) {
        ""
    } else if (originalString.length % 2 == 0) {
        originalString.substring(middleIndex - 1, middleIndex + 1)
    } else {
        originalString[middleIndex].toString()
    }
}
