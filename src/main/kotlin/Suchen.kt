//val artists = listOf(
//    "Leonardo da Vinci",
//    "Pablo Picasso",
//    "Vincent van Gogh",
//    "Claude Monet"
//)

class Suchen(private val artists: List<String>) {

    fun suchen(ergebnis: String): List<String> {
        return artists.filter { it.toLowerCase().contains(ergebnis.toLowerCase()) }
    }
}