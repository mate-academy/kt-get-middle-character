package mate.academy

fun getMiddleString(originalString: String): String {
    val halfLength: Int = originalString.length
    val result = when {
        halfLength == 0 ->  ""
        halfLength == 2 -> originalString
        halfLength % 2 == 0 -> originalString.substring(halfLength / 2 - 1, halfLength / 2 + 1)
        else -> originalString[halfLength / 2].toString()
    }
    return result
}
