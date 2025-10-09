package tema09

fun main(args: Array<String>) {
    var numero : Int
    var contador = 1
    var resultado = 1

    println("Introduzca numero")
    numero = readln().toString().toInt()

    do {
        resultado *= contador

        contador += 1
    } while (contador <= numero)
    println("Resultado: $resultado")
}
