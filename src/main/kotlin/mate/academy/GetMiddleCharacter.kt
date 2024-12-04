package mate.academy

fun getMiddleString(originalString: String): String {
    val middle = originalString.length / 2
    return when {
        originalString.isEmpty() -> ""
        originalString.length % 2 == 0 -> originalString.slice(middle - 1..middle)
        else -> originalString.slice(middle ..middle)
    }
}
