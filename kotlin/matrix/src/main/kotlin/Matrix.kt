class Matrix(private val matrixAsString: String) {

    fun column(colNr: Int): List<Int> {
        return matrixAsString.lines().map { s -> s.split(" ")[colNr - 1].toInt() }
    }

    fun row(rowNr: Int): List<Int> {
        return matrixAsString.lines()[rowNr - 1].split(" ").map { s -> s.toInt() }
    }
}
