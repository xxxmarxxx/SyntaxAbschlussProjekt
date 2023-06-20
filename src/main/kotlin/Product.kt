data class Product(
    val id: Int,
    val categories: String,
    val artist: String,
    val title: String,
    val dateOfWork: Int,
    val width: Double,
    val height: Double,
    val content: String,
    val price: Double,
    val edition: Int,
) {

    fun printProduct() {
        changeConsoleColor("\u001B[36m")
        println("\t****************************************")
        println("\t▓▓\tId: $id")
        println("\t▓▓\tKategorie: $categories")
        println("\t▓▓\tKünstler: $artist")
        println("\t▓▓\tTitel: $title")
        println("\t▓▓\tDatiert: $dateOfWork")
        println("\t▓▓\tBreite: $width cm")
        println("\t▓▓\tHöhe: $height cm")
        println("\t▓▓\tBeschreibung: $content")
        println("\t▓▓\tPreis: $price €")
        println("\t▓▓\tAuflage: $edition Stück")
        println("\t****************************************")
        resetConsoleColor()
    }

}

// Datenbank :)
