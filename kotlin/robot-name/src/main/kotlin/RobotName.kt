class Robot {
    companion object {
        private val NAMES = mutableSetOf<String>()
        private const val ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    }
    private var mutableName = newName()

    private fun newName(): String {
        var newName: String
        do {
            newName = "${randomLetter()}${randomLetter()}${randomDigit()}${randomDigit()}${randomDigit()}"
        } while (NAMES.contains(newName))
        NAMES.add(newName)
        return newName
    }

    private fun randomLetter() = ALPHABET[(0..25).random()]
    private fun randomDigit() = (0..9).random()

    val name: String
        get() = mutableName

    fun reset() {
        val originalName = mutableName
        mutableName = newName()
        NAMES.remove(originalName)
    }
}
