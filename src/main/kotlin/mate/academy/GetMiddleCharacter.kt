package mate.academy

fun getMiddleString(originalString: String): String {
    if (originalString.isEmpty()) return ""
    if (originalString.length % 2 != 0) {
        return originalString.substring((originalString.length / 2), (originalString.length / 2) + 1)
    }
    return originalString.substring((originalString.length / 2) -1 , (originalString.length / 2) + 1)
}

