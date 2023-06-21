import onbording.onBoarding

fun main() {

//    ---------- START-logo
    changeConsoleColor("\u001B[32m")
    onBoarding()
    resetConsoleColor()
    println()
//    ---------- LogoEND ----

//    ----- START LOGIN KUNDE/ADMIN

    Login().loginIn()
    Shop().suchenArtInKategorie()
//    println(Shop().categoryArts("Acryl"))

//    println("Wir haben Kunst dieser Künstler im Angebot: \n${Shop().kunstlerSortiment.keys}")
    println("Danke für besuch bei appArt")
//    ----- END LOGIN


//    println("Gib name Admin oder Kunde ein")
//    Menu().menu()


//    Menu().printMenu(UserType.ADMIN)
//    ------ END

}