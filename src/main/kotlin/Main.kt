import onbording.onBoarding

fun main() {

//    ---------- START-logo
    changeConsoleColor("\u001B[32m")
    onBoarding()
    resetConsoleColor()
    println()
//    ---------- LogoEND ----

//    ----- START LOGIN KUNDE/ADMIN

    Person("1","Admin","pass").printPerson()

//    ----- END LOGIN

    Menu().menu()
    Menu().printMenu(UserType.ADMIN)


}