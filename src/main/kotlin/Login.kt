import java.util.*

class Login {
    fun loginIn() {
        var validInput = false
        while (!validInput) {
            println("Sind Sie ein Kunde oder ein Admin? (Geben Sie Kunde/Admin ein)")
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
                println("Ungültige Auswahl. Bitte versuchen Sie es erneut.")
            }
        }
    }

    val produkt = mutableListOf<String>()
    val warenkorb = mutableListOf<String>()
    fun showCustomerMenu() {
        var beenden = false
        while (!beenden) {
            println("Bitte wählen Sie eine Option: \n1. Kunst von Künstler kaufen \n2. Kunst von Künstler aus Warenkorb löschen \n3. Meine Warenkorb \n4. Beenden")
            when (readln()) {
                "1" -> {
                    println("Kunst von Künstler kaufen")
                    val warenProdukt = readln()
                    warenkorb.add(warenProdukt)
                    println("Produkt '$warenProdukt' wurde hinzugefügt.")
                }
                "2" -> {
                    println("Kunst von Künstler aus Warenkorb löschen")
                    val loeschenProdukt = readln()
                    if (warenkorb.contains(loeschenProdukt) {
                        warenkorb.remove(loeschenProdukt)
                        println("Produkt '$loeschenProdukt' wurde gelöscht.")
                    } else {
                        println("Das Produkt konnte nicht gefunden werden.")
                    }
                }
                "3" -> {
                    println("Meine Warenkorb mit: $warenkorb")
                }
                "4" -> beenden = true
                else -> println("Ungültige Auswahl. Bitte versuchen Sie es erneut.")
            }
        }
    }

    fun showAdminMenu() {
        var beenden = false
        while (!beenden) {
            println("Bitte wählen Sie eine Option: \n1. Neue Kunst hinzufügen \n2. Kunst löschen \n3. Alle Bestellungen anzeigen \n4. Beenden")
            when (readln()) {
                "1" -> {
                    println("Neue Kunst hinzufügen")
                    val neueProdukt = readln()
                    produkt.add(neueProdukt)
                    println("Produkt '$neueProdukt' wurde hinzugefügt.")
                }

                "2" -> {
                    println("Geben Sie den Namen des Produkts ein, das Sie löschen möchten:")
                    val loeschenProdukt = readLine()
                    if (produkt.contains(loeschenProdukt)) {
                        produkt.remove(loeschenProdukt)
                        println("Produkt '$loeschenProdukt' wurde gelöscht.")
                    } else {
                        println("Das Produkt konnte nicht gefunden werden.")
                    }
                }
                "3" -> {
                    println("Alle Bestellungen anzeigen")
                    println("Alle Künstler: $produkt")
                }

                "4" -> beenden = true
                else -> println("Ungültige Auswahl. Bitte versuchen Sie es erneut.")
            }
        }
    }


}