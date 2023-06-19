class Shop {
    fun categoryArts(art: String): String {
        val malerei = mutableListOf<String>("Acryl", "Aquarell", "Gouache", "Tempera", "Ölfarben")
        val zeichnung = mutableListOf<String>(
            "Bleistift",
            "All-Stift",
            "Farbstift",
            "Pastellkreiden",
            "Ölpastellkreiden",
            "Zeichenkreide",
            "Zeichenkohle",
            "Silberstift",
            "Feder und Tusche",
            "Pinsel und Tusche",
            "Andere Zeichentechniken"
        )
        val drucken = mutableListOf<String>("Hochdruck", "Tiefdruck", "Lithografie", "Siebdruck")
        val digital = mutableListOf<String>("Digitale Bildbearbeitung", "Fotografie", "NFT")

        return when {
            art in malerei -> "[ Malerei ]"
            art in zeichnung -> "[ Zeichnung ]"
            art in drucken -> "[ Drucken ]"
            art in digital -> "[ Digital ]"
            else -> "Ungültiger Art"
        }
    }

}