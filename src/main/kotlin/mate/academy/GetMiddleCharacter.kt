package mate.academy

fun getMiddleString(originalString: String): String {
    val stringLength = originalString.length
    return when {
        stringLength == 0 -> ""
        stringLength % 2 == 0 ->
            originalString.substring(stringLength / 2 - 1, stringLength / 2 + 1)
        else -> originalString.substring(stringLength / 2, stringLength / 2 + 1)
    }
}
