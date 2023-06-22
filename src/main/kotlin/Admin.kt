
class Admin(username: String, password: String) : User(username, password, UserType.ADMIN) {


    fun login() {
        while (true) {
            println("\tBitte geben Sie Ihren Benutzernamen ein:")
            val inputUsername = readln() ?: ""

            println("\tBitte geben Sie Ihr Passwort ein:")
            val inputPassword = readln() ?: ""

            if (anmeldeTest(inputUsername, inputPassword)) {
                // Wenn der Login erfolgreich ist, greifen Sie auf Admin-spezifische Funktionen zu
                println("\t$userName hat sich erfolgreich eingeloggt \nund greift nun auf Admin-Funktionen zu.")
                break
            } else {
                println("\tLogin fehlgeschlagen. Bitte versuchen Sie es erneut.")
            }
        }

    }

}

