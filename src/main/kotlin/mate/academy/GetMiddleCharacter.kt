package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val length = originalString.length;
    return originalString.filterIndexed { index, _ -> index in (length / 2 - 1 + length % TWO)..(length / 2) }
}

const val TWO = 2
