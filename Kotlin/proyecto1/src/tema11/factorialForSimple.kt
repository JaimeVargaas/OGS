package tema11

import org.w3c.dom.ranges.Range

fun main(args: Array<String>) {
    var numero : Int
    var resultado = 1

    println("Introduzca numero")
    numero = readln().toString().toInt()

    // bucle for simple
    for (cont in 1..numero) {
        resultado *= cont
    }
    println("Resultado: $resultado")

    // bucle for usando una variable de tipo range
    var rango : IntRange = 1..numero

    resultado = 1
    for (cont in rango) {
        resultado *= cont
    }
    println("Resultado: $resultado")
}