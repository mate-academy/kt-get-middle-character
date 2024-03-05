package mate.academy

import kotlin.math.floor

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    if (originalString.isEmpty()) {
        return ""
    }

    return if (originalString.length % 2 == 0) {
        originalString[(originalString.length / 2) - 1].toString() +
        originalString[originalString.length / 2].toString()
    }
    else originalString[floor((originalString.length.toDouble() / 2)).toInt()].toString()
}
