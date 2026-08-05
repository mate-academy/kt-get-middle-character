package mate.academy

const val HALF: Int = 2;
const val ONE: Int = 1

fun getMiddleString(originalString: String): String {
    if (originalString.length < 2) {
        return originalString
    }
    val mid: String = originalString
        .substring(originalString.length / HALF, originalString.length / HALF + ONE)
    val middle: String = originalString
        .substring(originalString.length / HALF - ONE, originalString.length / HALF + ONE)
    return if (originalString.length % HALF == ONE) mid else middle
}
