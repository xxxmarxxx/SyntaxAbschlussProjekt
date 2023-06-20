open class Person(id: String, name: String, pass: String) {

    fun printPerson() {
        var validInput = false
        while (!validInput) {
            println("Sind Sie ein Kunde oder ein Admin? (Geben Sie Kunde/Admin ein)")
            val userType = readLine()
            val admin = mutableListOf<Product>()

            if (userType == "Kunde" || userType == "kunde") {
                val kunde = Kunde("Kunde", "pass")
                kunde.login()
                validInput = true
            } else if (userType == "Admin" || userType == "admin") {
                val admin = Admin("Admin", "pass")
                admin.login()
                validInput = true
            } else {
                println("Ungültige Auswahl. Bitte versuchen Sie es erneut.")
            }
        }
    }
}
