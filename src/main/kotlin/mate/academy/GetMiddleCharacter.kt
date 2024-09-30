package mate.academy

fun getMiddleString(originalString: String): String {
    if (originalString.isEmpty()) return originalString
    val middleIndex = originalString.length / 2
    return if (originalString.length % 2 == 1) originalString.substring(middleIndex, middleIndex + 1)
    else originalString.substring(middleIndex - 1, middleIndex + 1)
}
