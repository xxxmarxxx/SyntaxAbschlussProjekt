class Shop {

    val product1 = Product(1, "Acryl", "Boris", "\"the coder\"", 1990, 50.0, 80.0, "blabla", 1000.0, 1)
    val product2 = Product(2, "Aquarell", "Marcel", "the hit", 2010, 30.0, 30.0, "blablabla", 2000.0, 1)
    val product3 = Product(3, "Gouache", "Boris", "the hit", 2002, 20.0, 30.0, "blablabla", 2400.0, 1)
    val product4 = Product(4, "Tempera", "Gökhan", "the hit", 2004, 120.0, 90.0, "blablabla", 400.0, 1)
    val product5 = Product(5, "Ölfarben", "Johannes", "the hit", 2012, 200.0, 100.0, "blablabla", 200.0, 1)
    val product6 = Product(6, "Bleistift", "Boris", "the hit", 2011, 29.7, 42.3, "blablabla", 4000.0, 1)
    val product7 = Product(7, "All-Stift", "Gökhan", "the hit", 2000, 21.0, 29.7, "blablabla", 300.0, 1)
    val product8 = Product(8, "Farbstift", "Christian", "the hit", 2010, 21.0, 42.0, "blablabla", 2000.0, 1)
    val product9 = Product(9, "Pastellkreiden", "Christian", "the hit", 2004, 29.0, 42.0, "blablabla", 4500.0, 1)
    val product10 = Product(10, "Ölpastellkreiden", "Marcel", "the hit", 2005, 21.0, 29.0, "blablabla", 1800.0, 1)
    val product11 = Product(11, "Zeichenkreide", "Johannes", "the hit", 2006, 200.0, 100.0, "blablabla", 900.0, 1)
    val product12 = Product(12, "Zeichenkohle", "Sergej", "the hit", 2016, 20.2, 30.9, "blablabla", 340.0, 1)
    val product13 = Product(13, "Silberstift", "Christian", "the hit", 2020, 20.0, 30.0, "blablabla", 540.0, 1)
    val product14 = Product(14, "Feder und Tusche", "Marcel", "the hit", 2020, 20.0, 30.0, "blablabla", 1200.0, 1)
    val product15 = Product(15, "Pinsel und Tusche", "Johannes", "the hit", 2019, 20.0, 30.0, "blablabla", 400.0, 1)
    val product16 = Product(16, "Andere Zeichentechniken", "Christian", "the hit", 2017, 20.0, 30.0, "blablabla", 300.0, 1)
    val product17 = Product(17, "Hochdruck", "Marcel", "the hit", 2003, 20.0, 30.0, "blablabla", 500.0, 10)
    val product18 = Product(18, "Tiefdruck", "Boris", "the hit", 2001, 30.0, 20.0, "blablabla", 1400.0, 10)
    val product19 = Product(19, "Lithografie", "Sergej", "the hit", 2011, 20.0, 30.0, "blablabla", 2200.0, 10)
    val product20 = Product(20, "Siebdruck", "Boris", "the hit", 2004, 200.0, 100.0, "blablabla", 3000.0, 30)
    val product21 = Product(21, "Digitale Bildbearbeitung", "Marcel", "the hit", 2017, 30.0, 50.0, "blablabla", 4000.0, 20)
    val product22 = Product(22, "Fotografie", "Johannes", "the hit", 2010, 20.0, 20.0, "blablabla", 300.0, 20)
    val product23 = Product(23, "NFT", "Sergej", "the hit", 2022, 20.0, 30.0, "blablabla", 230.0, 20)

    //TODO weiter machen
    var products = mutableListOf<Product>(
        product1, product2, product3, product4, product5, product6,
        product7, product8, product9, product10, product11, product12, product13, product14, product15,
        product16, product17, product18, product19, product20, product21, product22, product23
    )


    fun removeProduct(product: Product, admin: Admin) {
        products.remove(product)
        println("\t${admin.userName} hat das Produkt im Shop mit Id:${product.id} entfernt: $product")
    }

    fun changeProduct(oldProduct: Product, newProduct: Product, admin: Admin) {
        val index = products.indexOf(oldProduct)
        if (index != -1) {
            products[index] = newProduct
            println("\t${admin.userName} hat Produkt geändert: $oldProduct zu $newProduct")
        } else {
            println("\t Das Produkt konnte nicht gefunden werden: $oldProduct")
        }
    }

    val kunstlerSortiment = mutableMapOf(
        "Dali" to 900.00,
        "Modigliani" to 500.00,
        "Picasso" to 700.00,
        "Schiele" to 1700.00,
        "Beksinski" to 1400.00,
        "Banksy" to 10.99,
        "Van Gogh" to 10.99

    )


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

    fun suchenArtInKategorie(){
        while (true){
            try {
                println("Wo finde ich ....")
                val suchen = readln()
                println(Shop().categoryArts(suchen))
                println("Die $suchen ist in der Kategorie ${categoryArts(suchen)}")
                println("weiter suchen(j/n):")
                val eingabe = readln()
                if (eingabe == "n"){
                    break
                }
            } catch (e:Exception){
                println("falsch")
            }
        }
    }

}