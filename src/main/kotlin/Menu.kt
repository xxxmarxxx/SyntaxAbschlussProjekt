class Menu {

    var istEsEinKundeOderEinAdmin: UserType = UserType.KUNDE
    var beenden = false
    fun menu() {

        while (!beenden) {

            val inputLogin = readln()
            if (inputLogin == "Admin") {
                istEsEinKundeOderEinAdmin = UserType.ADMIN
            } else {
                istEsEinKundeOderEinAdmin = UserType.KUNDE
            }
            printMenu(istEsEinKundeOderEinAdmin)
        }
    }

    fun printMenu(type: UserType) {
        if (type == UserType.ADMIN) {
            println("5 für Neues Produkt")
            println("6 für Produktänderung")
            println("7 für Löschen ein Produkt")
            println("8 Beenden")


            val adminInput = readln()

            when (adminInput) {
                "5" -> println("Jetzt neues Produkt hinzufügen...")
                "6" -> println("Jetzt Produkt ändern")
                "7" -> println("Jetzt Produkt löschen")
                "8" -> beenden = true
            }

        } else {
            println("1 - Künstler Produkt kaufen")
            println("2 - Künstler Produkt von Warenkorb löschen")
            println("3 - Meine warenkorb anzeigen")
            println("4 - Beenden")

            when (readln()) {
                "1" -> println("Kunst von Künstler kaufen")
                "2" -> println("Kunst von Künstler aus Warenkorb löschen")
                "3" -> println("Meine warenkorb ")
                "4" -> beenden = true

            }
        }

    }
}
