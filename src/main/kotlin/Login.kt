import java.util.*

class Login {
    fun loginIn() {
        var validInput = false
        while (!validInput) {
            println("\tSind Sie ein Kunde oder ein Admin? (Geben Sie Kunde/Admin ein)")
            val userType = readLine()
            val admin = mutableListOf<Product>()

            if (userType == "Kunde" || userType == "kunde") {
                val kunde = Kunde("Kunde", "pass")
                kunde.login()
                validInput = true
                showCustomerMenu()
            } else if (userType == "Admin" || userType == "admin") {
                val admin = Admin("Admin", "pass")
                admin.login()
                validInput = true
                showAdminMenu()
            } else {
                println("\tUngültige Auswahl. Bitte versuchen Sie es erneut.")
            }
        }
    }

    val shop = Shop()
    val produkt = mutableListOf<String>()
    val warenkorb = mutableListOf<String>()
    fun showCustomerMenu() {
        var beenden = false
        while (!beenden) {
            println("\tBitte wählen Sie eine Option: \n\t1. Kunst von Künstler kaufen \n\t2. Kunst von Künstler aus Warenkorb löschen \n\t3. Meine Warenkorb \n\t4. Beenden")
            when (readln()) {
                "1" -> {
                    println("\tKunst von Künstler kaufen")
                    println("\tWir haben Kunst dieser Künstler im Angebot: ")
                    for (product in shop.productsList){
                        product.printProduct()
                    }
                    val warenProdukt = readln()
                    warenkorb.add(warenProdukt)
                    println("\tProdukt '$warenProdukt' wurde hinzugefügt.")
                }

                "2" -> {
                    println("\tKunst von Künstler aus Warenkorb löschen")
                    val loeschenProdukt = readln()
                    if (warenkorb.contains(loeschenProdukt)) {
                        warenkorb.remove(loeschenProdukt)
                        println("\tProdukt '$loeschenProdukt' wurde gelöscht.")
                    } else {
                        println("\tDas Produkt konnte nicht gefunden werden.")
                    }
                }

                "3" -> {
                    println("\tMeine Warenkorb mit: $warenkorb")
                }

                "4" -> beenden = true
                else -> println("\tUngültige Auswahl. Bitte versuchen Sie es erneut.")
            }
        }
    }

    fun showAdminMenu() {
        var beenden = false
        while (!beenden) {
            println("\tBitte wählen Sie eine Option: \n\t1. Neue Kunst hinzufügen \n\t2. Kunst löschen \n\t3. Alle Bestellungen anzeigen \n\t4. Beenden")
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
