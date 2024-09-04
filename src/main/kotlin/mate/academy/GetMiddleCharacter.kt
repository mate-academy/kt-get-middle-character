package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String =
    if (originalString.isEmpty()) ""
    else originalString.slice((originalString.length - 1 ) / 2 .. originalString.length / 2 )
