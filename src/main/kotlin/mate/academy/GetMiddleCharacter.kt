package mate.academy

fun getMiddleString(originalString: String): String {
    val length = originalString.length
    if (length == 0) return ""
     return if (length % 2 == 0) {
         originalString.substring(length / 2 - 1, length / 2 + 1)
     } else {
         originalString[length / 2].toString()
     }
}
