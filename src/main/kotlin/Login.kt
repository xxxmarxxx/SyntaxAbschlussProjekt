import java.util.*

class Login {
    //    Login Admin/Kunde mit valid
    fun loginIn() {
        var validInput = false
        while (!validInput) {
            println("\tSind Sie ein Kunde oder ein Admin? (Geben Sie Kunde/Admin ein)")
            val userType = readln()
            val admin = mutableListOf<Product>()

            if (userType == "Kunde" || userType == "kunde") {
                val kunde = Kunde("Kunde", "pass")
                kunde.login()
                validInput = true
                showCustomerMenu(shop = Shop())
            } else if (userType == "Admin" || userType == "admin") {
                val admin = Admin("Admin", "pass")
                admin.login()
                validInput = true
                showAdminMenu(shop = Shop())
            } else {
                println("\tUngültige Auswahl. Bitte versuchen Sie es erneut.")
            }
        }
    }

    private fun showCustomerMenu(shop: Shop) { // Passing Shop object
        val warenkorb = mutableListOf<Product>()
        var beenden = false
        while (!beenden) {
            println(
                "\tBitte wählen Sie eine Option: " +
                        "\n\t1. Kunst von Künstler kaufen " +
                        "\n\t2. Kunst von Künstler aus Warenkorb löschen " +
                        "\n\t3. Meine Warenkorb " +
                        "\n\t4. Künstler suchen" +
                        "\n\t5. Beenden"

            )
            abstandUnten2()
            when (readln()) {

                "1" -> {
                    println("\tKunst von Künstler kaufen")
                    println("\tWir haben Kunst dieser Künstler im Angebot: ")
                    for (product in shop.productsList) {
                        product.printProduct()
                    }
                    val warenProduktId = readln().toIntOrNull()
                    if (warenProduktId != null) {
                        val produktZumHinzufuegen = shop.productsList.find { it.id == warenProduktId }
                        if (produktZumHinzufuegen != null) {
                            warenkorb.add(produktZumHinzufuegen)
                            shop.productsList.remove(produktZumHinzufuegen) // kunstler Produkt aus dem datenBank löschen
                            println("\tProdukt mit Id '$warenProduktId' wurde hinzugefügt.")
                        } else {
                            println("\tProdukt mit Id '$warenProduktId' wurde nicht gefunden.")
                        }
                    } else {
                        println("\tUngültige Eingabe. Bitte versuchen Sie es erneut.")
                    }
                }

                "2" -> {
                    println("\tKunst von Künstler aus Warenkorb löschen")
                    val loeschenProduktId = readln().toIntOrNull()
                    if (loeschenProduktId != null) {
                        val produktZumLoeschen = warenkorb.find { it.id == loeschenProduktId }
                        if (produktZumLoeschen != null) {
                            warenkorb.remove(produktZumLoeschen)
                            println("\tProdukt mit Id '$loeschenProduktId' wurde gelöscht.")
                        } else {
                            println("\tDas Produkt konnte nicht gefunden werden.")
                        }
                    } else {
                        println("\tUngültige Eingabe. Bitte versuchen Sie es erneut.")
                    }
                }

                "3" -> {
                    println("\tMeine ausgewählten Kunstwerke im Warenkorb: ")
                    for (product in warenkorb) {
                        product.printProduct()
                    }
                }

                "4" -> {
                    shop.suchenArtInShop()
                }

                "5" -> {
                    println("Sie wurde jetzt Ausgeloggt.")
                    println("Möchten Sie den Shop verlassen oder sich wieder anmelden?")
//                    beenden = true
                    val choice = readln()
                    if (choice == "n") {
                        loginIn()
                    } else {
                        beenden = true
                    }
                }

                else -> println("\tUngültige Auswahl. Bitte versuchen Sie es erneut.")

            }
        }
        abstandUnten2()
    }

    //    func ADMIN LOGIN/MENU
    private fun showAdminMenu(shop: Shop) {
        val produkt = mutableListOf<String>()
        var beenden = false
        while (!beenden) {
            println(
                "\tBitte wählen Sie eine Option: " +
                        "\n\t1. Neue Kunst hinzufügen " +
                        "\n\t2. Kunst löschen " +
                        "\n\t3. Alle Bestellungen anzeigen " +
                        "\n\t4. Beenden"
            )
            when (readln()) {
                "1" -> {
                    println("\tNeue Kunst hinzufügen")
                    val neueProdukt = readln()
                    produkt.add(neueProdukt)
                    println("\tProdukt '$neueProdukt' wurde hinzugefügt.")
                }

                "2" -> {
                    println("\tGeben Sie den Namen des Produkts ein, das Sie löschen möchten:")
                    val loeschenProdukt = readln()
                    if (produkt.contains(loeschenProdukt)) {
                        produkt.remove(loeschenProdukt)
                        println("\tProdukt '$loeschenProdukt' wurde gelöscht.")
                    } else {
                        println("\tDas Produkt konnte nicht gefunden werden.")
                    }
                }

                "3" -> {
                    println("\tAlle Bestellungen anzeigen")
                    println("\tAlle Künstler: $produkt")
                }

                "4" -> beenden = true
                else -> println("\tUngültige Auswahl. Bitte versuchen Sie es erneut.")
            }
        }

    }

}
