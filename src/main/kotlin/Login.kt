import java.util.*

class Login {

//    fun login() {
//        while (true) {
//            println("Bitte geben Sie Ihren Benutzernamen ein:")
//            val inputUsername = readln() ?: ""
//
//            println("Bitte geben Sie Ihr Passwort ein:")
//            val inputPassword = readln() ?: ""
//
//            if (anmeldeTest(inputUsername, inputPassword)) {
//                // Wenn der Login erfolgreich ist, gehen Sie zum Shop
//                println("$userName hat sich erfolgreich eingeloggt und wird zum Shop weitergeleitet.")
//                break
//            } else {
//                println("Login fehlgeschlagen. Bitte versuchen Sie es erneut.")
//            }
//        }
//    }


//    TODO:
    val users = mapOf(
        "mar" to "aaa",
        "admin" to "11",
    )

    fun printLogin() {
        val scanner = Scanner(System.`in`)
        println("+++++++++++++++++++")
        println("Willkommen! Bitte geben Sie Ihren Benutzernamen ein und (mit enter bestätigen):")
        val username = scanner.nextLine()
        println("Bitte geben Sie Ihr Passwort ein und (mit enter bestätigen):")
        val password = scanner.nextLine()
        if (authenticate(username, password, users)) {
            println()
            println("Anmeldung erfolgreich! Willkommen, \n \"$username\" ist eingeloggt")
        } else {
            println("Fehler bei der Anmeldung. Ungültiger Benutzername oder Passwort.")
        }

    }

    private fun authenticate(username: String, password: String, users: Map<String, String>): Boolean {
        if (users.containsKey(username)) {
            val gespeichertesPasswort = users[username]
            if (password == gespeichertesPasswort) {
                return true
            }
        }

        return false
    }

    fun dreiVersuche() {
        var versuche = 0
        var userLoggedIn = false
// TODO
        while (versuche < 3 && !userLoggedIn) {
            println("Geben sie ihr Passwort ein:")
            var pw = readln()
            if (pw == "admin") {
                userLoggedIn = true
            } else {
                println("Falsches Passwort. Versuch sie es noch einmal")
                versuche++ // versuche = versuche + 1
            }
        } // Ende der Schleife

        if (versuche == 3) {
            println("Kein Zugriff, Programm wird geschlossen")
        }
        if (userLoggedIn) {
            appStarten()
        }

    }

    fun appStarten() {
        println("Wilkomen")

    }
}