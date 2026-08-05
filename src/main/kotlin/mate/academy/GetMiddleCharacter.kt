package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
     return if (originalString.isEmpty()) {
         ""
     } else if (originalString.length % 2 == 0) {
        originalString.substring(originalString.length / 2 - 1, originalString.length / 2 + 1)
    } else {
        originalString.substring(originalString.length / 2, originalString.length / 2 + 1)
     }
}
