package color

class Colors {
    companion object {
        const val RESET = "\u001B[0m"
        const val BLACK = "\u001B[30m"
        const val RED = "\u001B[31m"
        const val GREEN = "\u001B[32m"
        const val YELLOW = "\u001B[33m"
        const val BLUE = "\u001B[34m"
        const val PURPLE = "\u001B[35m"
        const val CYAN = "\u001B[36m"
        const val WHITE = "\u001B[37m"
        const val BOLD = "\u001B[1m"
        const val UNDERLINE = "\u001B[4m"
        const val BACKGROUND_BLACK = "\u001B[40m"
        const val BACKGROUND_RED = "\u001B[41m"
        const val BACKGROUND_GREEN = "\u001B[42m"
        const val BACKGROUND_YELLOW = "\u001B[43m"
        const val BACKGROUND_BLUE = "\u001B[44m"
        const val BACKGROUND_PURPLE = "\u001B[45m"
        const val BACKGROUND_CYAN = "\u001B[46m"
        const val BACKGROUND_WHITE = "\u001B[47m"
        // Weitere Farbcodes können hier hinzugefügt werden


    }

    fun colorText(text: String, color: String): String {
        return "$color$text$RESET"
    }

    fun colorizeString(text: String, color: String): String {
        val resetColor = "\u001B[0m" // Zurücksetzen auf Standardfarbe
        return "$color$text$resetColor"
    }
}
