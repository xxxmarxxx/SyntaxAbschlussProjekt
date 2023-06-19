class Kunde(username: String, password: String) : User(username, password, UserType.KUNDE) {
    fun login() {
        while (true) {
            println("Bitte geben Sie Ihren Benutzernamen ein:")
            val inputUsername = readln() ?: ""

            println("Bitte geben Sie Ihr Passwort ein:")
            val inputPassword = readln() ?: ""

            if (anmeldeTest(inputUsername, inputPassword)) {
                // Wenn der Login erfolgreich ist, gehen Sie zum Shop
                println("$userName hat sich erfolgreich eingeloggt und wird zum Shop weitergeleitet.")
                break
            } else {
                println("Login fehlgeschlagen. Bitte versuchen Sie es erneut.")
            }
        }
    }

    val kontoStand: Double = 0.0
    val warenkorb = mutableListOf<Product>()

    //
    fun zumWarenkorbHinzufuegen(product: Product) {
        warenkorb.add(product)
        println("\t$userName hat das Produkt \"${product.artist}\" zum Warenkorb hinzugefügt.")
        println("\t$userName hat das Produkt \"${product.artist}\" zum Warenkorb hinzugefügt für ${product.price}€.")
    }

    fun ausWarenkorbLoeschen(product: Product) {
        println("\t$userName hat das Produkt \"${product.artist}\" vom Warenkorb entfernt.")
    }

    fun gesamtPreisWarenkorb(): Double {
        var gesamtPreis = 0.0
        for (product in warenkorb) {
            gesamtPreis += product.price
        }
        println("\tDer Gesamtpreis des Warenkorbs von $userName ist $gesamtPreis.")
        return gesamtPreis
    }
}