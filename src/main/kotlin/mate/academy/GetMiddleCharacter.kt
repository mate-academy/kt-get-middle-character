package mate.academy

fun getMiddleString(originalString: String): String {
    val length = originalString.length
    return when {
        length == 0 -> ""
        length % 2 == 0 -> originalString.substring(length / 2 - 1, length / 2 + 1)
        else -> originalString.substring(length / 2, length / 2 + 1)
    }
}

