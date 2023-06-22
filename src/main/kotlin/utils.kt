// func für Linien erzeugen
fun dotLine(zahl: Int, symbol: String) {
//    var symbol = ""
    var index = 1
    while (index <= zahl) {
        print(symbol)
        index++

    }
}
fun abstandUnten2() {
    repeat(5) {
        println()
    }
}

// print abstand links
fun printWithIndent(indent: Int, message: String) {
    for (i in 0 until indent) {
        print(" ") // Druckt ein Leerzeichen
    }
    println(message) // Druckt die Nachricht
}
// printWithIndent(5, "Hallo, Welt!") // Druckt "     Hallo, Welt!"

// func für Zeichen als Linie erzeugen
fun dotLine2(zahl: Int, symbol: String) {
//    var symbol = ""
    var index = 1
    while (index <= zahl) {
        print(symbol)
        println()
        index++
    }
}

// Abstand von der Unterkante der Konsole
fun abstandUnten(abstand: Int) {
    for (i in abstand downTo 1)
        println()
}


// var symbol = "▓▓ "
// function für leerZeichen padEnd()
fun leerZeichen2(str: String, buchSt: Int = 25): String {
    return if (str.length < buchSt)
        str.padEnd(buchSt, ' ')
    else if (str.length > buchSt)
        str.substring(0, buchSt)
    else str
}

fun leerZeichen(text: String) {
//    val text = "Dies ist ein längerer Text."
    val formattedText = text.padStart(32).padEnd(36)
    println("'$formattedText'")
}

fun imageGrafik() {
    println(
        """
    ......................•••••••••••••••••••••••••.......................
    ......................|                       |.......................
    ......................|    •appArt GALERIE•     |.......................
    ......................|       WELCOME :)      |.......................
    ......................|                       |.......................
    ......................|                       |.......................
    ......................•••••••••••••••••••••••••.......................
        """.trimIndent()
    )
}

// grafik ohne color
fun grafik() {
    println(
        """
---------------------------------------------------------------------------------                                                                                      
       db                                         db                              
      d88b                                       d88b                      ,d     
     d8'`8b                                     d8'`8b                     88     
    d8'  `8b      8b,dPPYba,   8b,dPPYba,      d8'  `8b      8b,dPPYba,  MM88MMM  
   d8YaaaaY8b     88P'    "8a  88P'    "8a    d8YaaaaY8b     88P'   "Y8    88     
  d8""${'"'}${'"'}${'"'}${'"'}${'"'}${'"'}8b    88       d8  88       d8   d8""${'"'}${'"'}${'"'}${'"'}${'"'}${'"'}8b    88            88     
 d8'        `8b   88b,   ,a8"  88b,   ,a8"  d8'        `8b   88            88,    
d8'          `8b  88`YbbdP"'   88`YbbdP"'  d8'          `8b  88            "Y888  
                  88           88                                                 
                  88           88   
--------------------------------------------------------------------------------                                                                
        """.trimIndent()
    )
}

// grafik mit color
fun colorGrafik() {
    val redColor = "\u001B[38;5;245m" // Kolor czerwony
    val resetColor = "\u001B[0m" // Resetowanie kolorów

    println(
        """
       $redColor
    ################################################################################
           db                                         db                                    
          d88b                                       d88b                      ,d     
         d8'`8b                                     d8'`8b                     88     
        d8'  `8b      8b,dPPYba,   8b,dPPYba,      d8'  `8b      8b,dPPYba,  MM88MMM  
       d8YaaaaY8b     88P'    "8a  88P'    "8a    d8YaaaaY8b     88P'   "Y8    88     
      d8""${'"'}${'"'}${'"'}${'"'}${'"'}${'"'}8b    88       d8  88       d8   d8""${'"'}${'"'}${'"'}${'"'}${'"'}${'"'}8b    88            88     
     d8'        `8b   88b,   ,a8"  88b,   ,a8"  d8'        `8b   88            88,    
    d8'          `8b  88`YbbdP"'   88`YbbdP"'  d8'          `8b  88             "Y888  
                      88           88                                                 
                      88           88     
    #################################################################################                                                              
        """.trimIndent() + resetColor
    )
}

fun adresse(){
    println()
    println("\t\tSyntax Projekt 2023")
    println("\t\tappArt in Kotlin")
    println("\t\tVersion 1.01")
    println("\t\tMariusz Brainard")
    println("\t\t12163 Berlin")
}

fun dankSage(){
    println("\t\tVielen Dank für den Besuch der Galerie")
}

fun category(arts: MutableList<String>) {
    val name = "Zeichnung"
    println("${name.uppercase()}:")
    println("--------")
    for (art in arts) {
        val kategorie = Shop().categoryArts(art)
        if (kategorie == "[ Zeichnung ]") {
            println(art)
        }
    }

}

fun listing(arts: MutableList<String>) {
    for (i in 0 until arts.size) {
        arts[i] = "${i + 1}. ${arts[i]}"
    }
    for (item in arts) {
        println(item)
    }
}

fun allArts(arts: MutableList<String>) {
    for (art in arts) {
        val alleArten = Shop().categoryArts(art)
        println("* $art befindet sich in der -> $alleArten")
    }
}

fun escapedCharakters() {
    println("\t1 to jest Tab\t i dalej po")
    println("\t2 to jest Backspace\b\b\b\b  i dalej po")
    println("\t 3to jest neu zeile\n \ti dalej po")
    println("\t4 to jest zeileumbruch\r \t4i dalej po")
    println("\t5 to jest neu zeile\n \t i dalej po")
    println("\t6 to jest neu \$ zeile \t i dalej po")
    println("\t7 to jest neu \'zeile\' \t i dalej po")
    println("\t8 to jest zeileumbruch\\ \r i dalej po")
}



// für color in konsole start
fun changeConsoleColor(colorCode: String) {
    print(colorCode)
}

// für color in konsole end
fun resetConsoleColor() {
    print("\u001B[0m")
}

fun main() {
    escapedCharakters()
}