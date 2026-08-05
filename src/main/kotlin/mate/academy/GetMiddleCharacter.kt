package mate.academy

fun getMiddleString(originalString: String): String {
    return if (originalString.isEmpty()) {
        ""
    } else {
        val length = originalString.length
        val midIndex = length / 2

        if (length % 2 != 0) {
            originalString[midIndex].toString()
        } else {
            originalString.substring(midIndex - 1, midIndex + 1)
        }
    }
}
