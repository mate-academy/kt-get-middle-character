package mate.academy

fun getMiddleString(originalString: String): String {
    val length = originalString.length

    return when {
        length == 0 -> ""
        length % 2 == 1 -> originalString[length / 2].toString()
        length % 2 == 0 -> originalString[length / 2 - 1].toString() + originalString[length / 2].toString()
        else -> originalString
    }
}
