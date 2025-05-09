package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val middle = originalString.length / 2
    val isOdd = originalString.length % 2 == 1
    return when (originalString) {
        "" -> ""
        else ->
            if (isOdd) originalString.get(middle).toString()
            else originalString.slice(middle - 1..middle)
    }
}
