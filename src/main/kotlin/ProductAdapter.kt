class ProductAdapter(private val products: List<Product>) {

    fun displayProducts() {
        for (product in products) {
            println("--------------------------------")
            println(product)
        }
    }
}
fun printProduct(eingebe: String) {
    println("  Product Id ist: ${Shop().product1.id}")
    println("  Product befindet sich in der Kategorie: ${Shop().product1.categories}")
    println("  Name der Artist ist: ${Shop().product1.artist}")
    println("  Title des Bildes ist: ${Shop().product1.title}")

}

fun main(){
    println("gibt was")
    val eingebe = readln()
    println(Shop().product10)
    printProduct(eingebe)
}