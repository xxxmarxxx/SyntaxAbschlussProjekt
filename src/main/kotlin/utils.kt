// func für Linien erzeugen
fun dotLine(zahl: Int, symbol: String) {
//    var symbol = ""
    var index = 1
    while (index <= zahl) {
        print(symbol)
        index++

    }
}
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
    ......................|    •STEICHEL Z00•     |.......................
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
    val redColor = "\u001B[31m" // Kolor czerwony
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

//fun categoryArts(art: String): String {
//    val malerei = mutableListOf<String>("Acryl", "Aquarell", "Gouache", "Tempera", "Ölfarben")
//    val zeichnung = mutableListOf<String>(
//        "Bleistift", "All-Stift", "Farbstift", "Pastellkreiden",
//        "Ölpastellkreiden", "Zeichenkreide", "Zeichenkohle", "Silberstift",
//        "Feder und Tusche", "Pinsel und Tusche", "Andere Zeichentechniken"
//    )
//    val drucken = mutableListOf<String>("Hochdruck", "Tiefdruck", "Lithografie", "Siebdruck")
//    val digital = mutableListOf<String>("Digitale Bildbearbeitung", "Fotografie", "NFT")
//
//    return when {
//        art in malerei -> "[ Malerei ]"
//        art in zeichnung -> "[ Zeichnung ]"
//        art in drucken -> "[ Druck ]"
//        art in digital -> "[ Digital ]"
//        else -> "Ungültiger Art"
//    }
//}

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

fun main() {
    escapedCharakters()
}
// für color in konsole start
fun changeConsoleColor(colorCode: String) {
    print(colorCode)
}
// für color in konsole end
fun resetConsoleColor() {
    print("\u001B[0m")
}