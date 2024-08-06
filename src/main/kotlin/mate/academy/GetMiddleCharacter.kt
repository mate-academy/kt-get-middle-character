package mate.academy


fun getMiddleString(originalString: String): String {
    if (originalString.length == 0) {
        return ""
    }
    var result: String = if (originalString.length % 2 == 0) originalString.substring(
        originalString.length / 2 - 1,originalString.length / 2 + 1)
    else originalString.substring(originalString.length / 2,originalString.length / 2 + 1)
    return result
}
