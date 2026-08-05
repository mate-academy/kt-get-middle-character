package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val lengthOfstr = originalString.length
    if (lengthOfstr == 0) {
        return ""
    }
    return s(lengthOfstr, originalString)
}

private fun s(lengthOfstr: Int, originalString: String): String {
    if (lengthOfstr % 2 == 0) {
        var middle1 = lengthOfstr / 2 - 1
        var middle2 = lengthOfstr / 2
        return originalString.slice(middle1..middle2)
    } else {
        var middle1 = lengthOfstr / 2
        return originalString.get(middle1).toString()
    }
}
