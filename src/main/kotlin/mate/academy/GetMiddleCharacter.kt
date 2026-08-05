package mate.academy

fun getMiddleString(originalString: String): String {
    return when {
        originalString.length == 0 -> originalString
        originalString.length % 2 == 0 -> "${originalString.get(originalString.length / 2 - 1)}" +
                "${originalString.get(originalString.length / 2)}"
        else -> "${originalString.get(originalString.length / 2)}"
    }
}
