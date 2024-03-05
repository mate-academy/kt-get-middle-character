package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    if (originalString.isEmpty()) {
        return  originalString
    }
    return if(originalString.length % 2 == 0) originalString.get((originalString.length / 2) - 1).toString() +
            originalString.get(originalString.length / 2).toString()
    else originalString.get(originalString.length / 2).toString()
}
