package mate.academy

import kotlin.math.ceil

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    if (originalString.isBlank()) {
        return ""
    }
    val result : String
    val middle = ceil((originalString.length / 2).toDouble()).toInt() - 1

    if (originalString.length % 2 == 0) {
        result = originalString[middle].toString() + originalString[middle + 1]
    } else {
        result = originalString[middle + 1].toString()
    }
    return result
}
