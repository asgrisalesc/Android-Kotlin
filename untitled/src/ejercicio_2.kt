class Product() {
    var code: Int? = null
    var nombre: String? = null
    var valor: Double? = null
    var cantidad: Int? = null

    constructor(code: Int) : this() {
        this.code = code
    }
}

fun main(args: Array<String>) {
    // val regex = """a([bc]+)d?""".toRegex()
    val inputCode = readLine()
    val regex = """\d+""".toRegex()

    var product = Product()
    product.code = 1
    product.nombre = "Jabon"
    product.valor = 5000.0
    product.cantidad = 10

    var product2 = Product()
    product2.code = 2
    product2.nombre = "Arroz"
    product2.valor = 3000.0
    product2.cantidad = 8

    var product3 = Product()
    product3.code = 3
    product3.nombre = "Lentejas"
    product3.valor = 4500.0
    product3.cantidad = 6

    val products =arrayOf(product,product2,product3)

    println("Codigo del producto: ")
    var icodigo = readLine()

    if (regex.matches(inputCode.toString())) {
            val code = inputCode.toString().toInt()
            println("code: $code")
        val p = products.firstOrNull {x -> x.code}
        if (p != null) {
            println("${p.name}")
        }

    }
}





