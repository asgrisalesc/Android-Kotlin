var apellido: String? = null

fun main(args: Array<String>) {
    val array = arrayOf(5, 7, 9, 20, 1, 8, 32)

    var num = 1
    num = 5
    println("El valor es de  ${num}")

    val pr = 3.141516 // value variable inmutable
    println("El valor de PI es $pr")
    var nombre = "Aula Matriz"
    var nombre2: String = "Aula Matriz 2"
    apellido = "Grisales"

    for (num in array) {
        println(" El valor del array es $num")
    }
    array.forEach {
        println("$it")
    }
    println("${array.get(2)}")
    for (x in 0..10) {
        println("el valor es $x")
    }

    array.filter { num -> num > 6 }.forEach {
        println("$it")
    }

    for (x in 0..12) {
        for (m in 0..10) {
           var r = x*m
            println("el valor es $r")
        }
    }
// var a = num.toByte()

}







