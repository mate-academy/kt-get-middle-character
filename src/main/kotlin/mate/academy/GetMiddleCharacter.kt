package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    if (originalString.length == 0) {return ""}
    originalString.let {
        val length = it.length
        return if (length % 2 == 0) {
            it.substring(length / 2 - 1, length / 2 + 1)
        } else {
            it[length / 2].toString()
        }
    }
}
