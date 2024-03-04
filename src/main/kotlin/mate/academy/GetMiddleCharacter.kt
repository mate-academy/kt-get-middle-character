package mate.academy

fun getMiddleString(originalString: String): String {
    val length = originalString.length
    val middle = length / 2
    return if (length == 0) ""
        else if (length % 2 == 0) "${originalString[middle - 1]}${originalString[middle]}"
        else "${originalString[middle]}"
}
