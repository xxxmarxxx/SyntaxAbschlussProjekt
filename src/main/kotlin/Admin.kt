
class Admin(username: String, password: String) : User(username, password, UserType.ADMIN) {


    fun login() {
        while (true) {
            println("Bitte geben Sie Ihren Benutzernamen ein:")
            val inputUsername = readln() ?: ""

            println("Bitte geben Sie Ihr Passwort ein:")
            val inputPassword = readln() ?: ""

            if (anmeldeTest(inputUsername, inputPassword)) {
                // Wenn der Login erfolgreich ist, greifen Sie auf Admin-spezifische Funktionen zu
                println("$userName hat sich erfolgreich eingeloggt \nund greift nun auf Admin-Funktionen zu.")
                break
            } else {
                println("Login fehlgeschlagen. Bitte versuchen Sie es erneut.")
            }
        }

    }

}

