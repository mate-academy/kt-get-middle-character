package mate.academy

fun getMiddleString(originalString: String): String {
    if (originalString.length == 0) {
        return ""
    }
    if (originalString.length % 2 == 0) {
        return originalString[originalString.length / 2 - 1] + originalString[originalString.length / 2].toString()
    } else {
        return originalString[originalString.length / 2].toString()
    }
}
