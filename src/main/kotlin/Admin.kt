
class Admin(username: String, password: String) : User(username, password, UserType.ADMIN) {


    fun login() {
        while (true) {
            println("Bitte geben Sie Ihren Benutzernamen ein:")
            val inputUsername = readln() ?: ""

            println("Bitte geben Sie Ihr Passwort ein:")
            val inputPassword = readln() ?: ""

            if (anmeldeTest(inputUsername, inputPassword)) {
                // Wenn der Login erfolgreich ist, greifen Sie auf Admin-spezifische Funktionen zu
                println("$userName hat sich erfolgreich eingeloggt \nund greift nun auf Admin-Funktionen zu.(-return-)")
                break
            } else {
                println("Login fehlgeschlagen. Bitte versuchen Sie es erneut.")
            }
        }
//        println("fragen: Add oder remove, change")
//        val auswal = readln()

    }


    var products = mutableListOf<Product>()

    fun addNewProduct(product: Product) {
        products.add(product)
        println("\t${userName} hat das Produkt zum Shop hinzugefügt: $product")
    }

    fun removeProduct(product: Product) {
        products.remove(product)
        println("\t${userName} hat das Produkt im Shop mit Id:${product.id} entfernt: $product")
    }

    fun changeProduct(oldProduct: Product, newProduct: Product) {
        val index = products.indexOf(oldProduct)
        if (index != -1) {
            products[index] = newProduct
            println("\t$userName hat Produkt geändert: $oldProduct zu $newProduct")
        } else {
            println("\t Das Produkt konnte nicht gefunden werden: $oldProduct")
        }
    }


}

