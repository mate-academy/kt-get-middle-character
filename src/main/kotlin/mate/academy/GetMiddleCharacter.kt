package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(s: String): String = when {
    s.isEmpty() -> s
    s.length % 2 == 0 -> s.substring(s.length / 2 - 1, s.length / 2 + 1)
    else -> s[s.length / 2].toString()
}
