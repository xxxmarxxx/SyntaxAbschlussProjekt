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

//    fun printProduct() {
//        changeConsoleColor("\u001B[36m")
//        println("\t****************************************")
//        println("\t▓▓\tId: $id")
//        println("\t▓▓\tKategorie: $categories")
//        println("\t▓▓\tKünstler: $artist")
//        println("\t▓▓\tTitel: $title")
//        println("\t▓▓\tDatiert: $dateOfWork")
//        println("\t▓▓\tBreite: $width cm")
//        println("\t▓▓\tHöhe: $height cm")
//        println("\t▓▓\tBeschreibung: $content")
//        println("\t▓▓\tPreis: $price €")
//        println("\t▓▓\tAuflage: $edition Stück")
//        println("\t****************************************")
//        resetConsoleColor()
//    }

    fun printProduct() {
println()
        changeConsoleColor("\u001B[38;5;240m")
println("\t●〕〔●〕〔●〕〔●〕〔●〕〔●〕〔●〕〔●〕〔●〕〔●〕〔●〕〔●〕〔●〕〔●")
        resetConsoleColor()
        changeConsoleColor("\u001B[38;5;245m")
println("\tappART ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Künstler ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ GALERIE")
println("\t▓▓▓▓▓▓▓▓▓▓\tId: $id \t▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓")
println("\t▓▓▓▓▓▓▓▓▓▓\tKategorie: $categories \t▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓")
println("\t▓▓artist▓▓\tKünstler: $artist \t▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓")
println("\t▓▓▓▓▓▓▓▓▓▓\tTitel: $title \t▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓title▓▓▓▓▓▓")
println("\t▓▓▓▓▓▓▓▓▓▓\tDatiert: $dateOfWork \t▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓")
println("\t▓▓▓▓▓▓▓▓▓▓\tBreite: $width cm \t▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓")
println("\t▓▓▓▓▓▓▓▓▓▓\tHöhe: $height cm \t▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓")
println("\t▓▓▓▓▓▓▓▓▓▓\tBeschreibung: $content \t▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓")
println("\t▓▓▓▓▓▓▓▓▓▓\tPreis: $price € \t▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓price▓▓▓▓▓▓▓▓▓▓")
println("\t▓▓▓▓▓▓▓▓▓▓\tAuflage: $edition Stück \t▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓")
        resetConsoleColor()
    Thread.sleep(500)
        abstandUnten(2)
    }
}

