import onbording.onBoarding

fun main() {

//    ---------- START-logo
    onBoarding()
    println()
    abstandUnten(3)
//    ---------- LogoEND ----

//    ----- START LOGIN KUNDE/ADMIN
    val shop = Shop()
    Login().loginIn()
//    println(Shop().categoryArts("Acryl"))

//    shop.suchenArtInKategorie()
//    shop.suchenArtInShop()
    abstandUnten(5)

    println("\t\tVielen Dank für den Besuch der Galerie")
    colorGrafik()
    adresse()
    abstandUnten(10)
//    ----- END LOGIN


//    println("Gib name Admin oder Kunde ein")
//    Menu().menu()


//    Menu().printMenu(UserType.ADMIN)
//    ------ END

}