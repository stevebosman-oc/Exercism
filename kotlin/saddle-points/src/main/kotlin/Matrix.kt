data class MatrixCoordinate(val row: Int, val col: Int)

class Matrix(cells: List<List<Int>>) {

    val saddlePoints: Set<MatrixCoordinate>

    init {
        if (cells[0].isEmpty()) {
            saddlePoints = emptySet()
        } else {
            val maxPoints = mutableSetOf<MatrixCoordinate>()
            for (i in cells.indices) {
                var maxValue: Int = cells[i][0]
                for (j in 1 until cells[i].size) {
                    maxValue = maxOf(maxValue, cells[i][j])
                }
                for (j in 0 until cells[i].size) {
                    if (maxValue == cells[i][j]) {
                        maxPoints.add(MatrixCoordinate(i + 1, j + 1))
                    }
                }
            }

            val minPoints = mutableSetOf<MatrixCoordinate>()
            for (j in 0 until cells[0].size) {
                var minValue: Int = cells[0][j]
                for (i in 1 until cells.size) {
                    minValue = minOf(minValue, cells[i][j])
                }
                for (i in cells.indices) {
                    if (minValue == cells[i][j]) {
                        minPoints.add(MatrixCoordinate(i + 1, j + 1))
                    }
                }
            }

            saddlePoints = minPoints.intersect(maxPoints).toSet()

        }
    }
}
