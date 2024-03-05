package mate.academy

fun getMiddleString(originalString: String): String {
    val length: Int = originalString.length
    val result = when {
        length <= 2 -> originalString
        length % 2 == 0 -> originalString.substring(length / 2 - 1, length / 2 + 1)
        else -> originalString[length / 2].toString()
    }
    return result
}
