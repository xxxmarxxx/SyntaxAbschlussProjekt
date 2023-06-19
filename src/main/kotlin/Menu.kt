//enum class UserType {
//    KUNDE,
//    ADMIN
//}
class Menu {

    fun menu() {
        var isItAKundeOrAnAdmin: UserType = UserType.KUNDE
        while (true) {

            var inputLogin = readln()
            if (inputLogin == "Admin") {
                isItAKundeOrAnAdmin = UserType.ADMIN
            } else {
                isItAKundeOrAnAdmin = UserType.KUNDE
            }
            printMenu(isItAKundeOrAnAdmin)
        }
    }

    fun printMenu(type: UserType) {
        if (type == UserType.ADMIN) {
            println("1 für Neues Produkt")
            println("2 für Produktänderung")
            println("3 für Löschen ein Produkt")

            when (readln()) {
                "1" -> println("Jetzt neues Produkt hinzufügen...")
                "2" -> println("Jetzt Produkt ändern")
                "3" -> println("Jetzt Produkt löschen")
            }

        } else if (type == UserType.KUNDE) {
            println("1 - für Produkte anzeigen")
            println("2 - für Produkt kaufen")
            println("3 - für warenkorb")

            when (readln()) {
                "1" -> println("Kunst von Artist zeigen")
                "2" -> println("Kunst von Artist kaufen")
                "3" -> println("Kunst von warenkorb löschen")
            }
        }
    }
}