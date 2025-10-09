package tema04

fun main(args: Array<String>) {

    var entero : Int
    var cadenaNula : String?
    var cadena : String

    println("Introduzca cadenaNula")
    cadenaNula = readLine()

    println("Introduzca cadena")
    cadena = readLine()!!

    println("Introduzca cadena")
    cadena = readLine() ?: ""

    println("Introduzca entero: ")
    entero = readLine()?.toString()?.toInt() ?: 10


}