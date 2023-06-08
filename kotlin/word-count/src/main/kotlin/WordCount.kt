import java.util.*

object WordCount {
    fun phrase(phrase: String): Map<String, Int> {
        val normalisedPhrase = phrase.replace("[^a-zA-Z'\\d]+".toRegex(), " ").trim().lowercase(Locale.getDefault())
        val words = normalisedPhrase.split(' ').map{ it.trim('\'') }
        return words.groupingBy { it }.eachCount()
    }
}
