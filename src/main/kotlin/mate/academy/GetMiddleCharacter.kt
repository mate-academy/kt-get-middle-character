package mate.academy

fun getMiddleString(originalString: String): String {
    var result: String = ""
    var size = originalString.length
    if (size % 2 == 0 && size != 0) {
        result = (originalString[size / 2 - 1].toString() + originalString[size / 2])
    } else if (size != 0){
        result = originalString[size / 2].toString()
    }
    return result
}
