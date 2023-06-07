object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> {
        val list = mutableListOf<Any>()
        source.forEach { e ->
            when (e) {
                is Collection<*> -> list.addAll(flatten(e))
                is Any -> list.add(e)
            }
        }
        return list.toList()
    }
}
