class Triangle<out T : Number>(val a: T, val b: T, val c: T) {

    init {
        if (a == 0 && b == 0 && c == 0) throw IllegalArgumentException("Not a triangle")
        if ((a.toDouble() + b.toDouble() < c.toDouble())
            || (a.toDouble() + c.toDouble() < b.toDouble())
            || (b.toDouble() + c.toDouble() < a.toDouble())) {
            throw IllegalArgumentException("Not a triangle")
        }
    }

    val isEquilateral: Boolean = (a == b) && (b == c)
    val isIsosceles: Boolean = (a == b) || (b == c) || (a == c)
    val isScalene: Boolean = !isIsosceles
}
