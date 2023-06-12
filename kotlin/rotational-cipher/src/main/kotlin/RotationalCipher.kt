class RotationalCipher(private val offset: Int) {
    fun encode(text: String): String {
        return text.map {
            when {
                it.isLowerCase() -> rotate(it, 'a')
                it.isUpperCase() -> rotate(it, 'A')
                else -> it
            }
        }.joinToString("")
    }

    private fun rotate(it: Char, base: Char) = (base + (it - base + offset) % 26)
}
