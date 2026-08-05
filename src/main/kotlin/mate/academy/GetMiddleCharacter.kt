package mate.academy

fun getMiddleString(originalString: String): String {
    val halfLength = originalString.length / 2
    return if (originalString.isEmpty()) {
        ""
    } else if (originalString.length % 2 == 0) {
        "${originalString[halfLength - 1]}${originalString[halfLength]}"
    } else {
        "${originalString[halfLength]}"
    }
}
