package mate.academy

fun getMiddleString(originalString: String): String {
    if(originalString.isEmpty()) return ""
    val mid = originalString.length / 2
    return if (originalString.length % 2 == 0)
        originalString.substring(mid - 1, mid + 1)
    else originalString[mid].toString()
}
