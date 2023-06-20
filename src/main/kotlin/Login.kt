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
            when (readLine()) {
                "1" -> println("Kunst von Künstler kaufen")
                "2" -> println("Kunst von Künstler aus Warenkorb löschen")
                "3" -> println("Meine Warenkorb")
                "4" -> beenden = true
                else -> println("Ungültige Auswahl. Bitte versuchen Sie es erneut.")
            }
        }
    }

    fun showAdminMenu() {
        var beenden = false
        while (!beenden) {
            println("Bitte wählen Sie eine Option: \n1. Neue Kunst hinzufügen \n2. Kunst löschen \n3. Alle Bestellungen anzeigen \n4. Beenden")
            when (readLine()) {
                "1" -> {
                    println("Neue Kunst hinzufügen")
                    val neueProdukt = readln()
                    produkt.add(neueProdukt)
                    println("Produkt '$neueProdukt' wurde hinzugefügt.")
                }

                "2" -> {
                    println("Kunst löschen")
                    val loeschenProdukt: String = readln()

                }
                "3" -> {
                    println("Alle Bestellungen anzeigen")
                    println("Alle produkte: $produkt")
                }

                "4" -> beenden = true
                else -> println("Ungültige Auswahl. Bitte versuchen Sie es erneut.")
            }
        }
    }


}