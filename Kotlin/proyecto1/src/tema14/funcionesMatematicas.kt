package tema14

import inicio.factorial

fun sumatorio (numero : Int) : Int {
    var result = 0
    for (i in 1 ..numero) {
        result += i
    }
    return result
}

fun factorial (numero : Int) : Int {
    var result = 1
    for (i in 2 ..numero) {
        result *= i
    }
    return result
}

fun main (args: Array<String>) {
    var numero : Int
    println(" Introduzca numero: ")
    numero = readLine()!!.toInt()

    println("El sumatorio de $numero es: ${sumatorio(numero)}")
    println("El factorial de $numero es: ${factorial(numero)}")
}

fun abs(numero : Int) : Int {
    if(numero < 0) -numero else numero
}
