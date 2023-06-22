import onbording.onBoarding

fun main() {

//    ---------- START LOGO
    onBoarding()
    println()
    abstandUnten(3)
//    ---------- END LOGO ----

//    ----- START LOGIN KUNDE/ADMIN
//    val shop = Shop()
    Login().loginIn()
//    ----- END LOGIN
    abstandUnten(5)

    dankSage()
    colorGrafik()
    adresse()
    abstandUnten(10)

}