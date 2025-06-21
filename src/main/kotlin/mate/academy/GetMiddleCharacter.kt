package mate.academy

fun getMiddleString(originalString: String): String {
    val result = when {
        originalString.isBlank() || originalString.length == 1 -> originalString
        originalString.length % 2 != 0 -> originalString[originalString.length / 2].toString()
        else -> {
            val half = originalString.length / 2
            originalString[half - 1].toString() + originalString[half]
        }
    }
    return result
}
