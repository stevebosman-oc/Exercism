class RotationalCipher(private val offset: Int) {
    fun encode(text: String): String {
        return text.map {
            when {
                it.isLowerCase() -> it.rotate('a')
                it.isUpperCase() -> it.rotate('A')
                else -> it
            }
        }.joinToString("")
    }

    private fun Char.rotate(base: Char) = (base + (this - base + offset) % 26)
}
