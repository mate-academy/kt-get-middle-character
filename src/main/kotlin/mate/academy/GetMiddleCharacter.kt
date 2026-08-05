package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    return originalString.drop((originalString.length - 1) / 2).take(2 - originalString.length % 2)
}
