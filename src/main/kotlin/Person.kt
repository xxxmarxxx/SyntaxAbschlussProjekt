
open class Person(id:String, name: String, pass: String) {

    fun printPerson(){
        println("Sind Sie ein Kunde oder ein Admin? (Geben Sie Kunde/Admin ein)")
        val userType = readln()
        val admin = mutableListOf<Product>()

        if (userType == "Kunde" || userType == "kunde") {
            val kunde = Kunde("Kunde", "pass")
            kunde.login()
        } else if (userType == "Admin" || userType == "admin") {
            val admin = Admin("Admin", "pass")
            admin.login()
        } else {
            println("Ungültige Auswahl.")
        }

    }

}