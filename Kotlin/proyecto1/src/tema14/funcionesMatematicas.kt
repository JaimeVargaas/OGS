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

fun abs(numero : Int) : Int = if(numero < 0) -numero else numero

// funcion negacion
fun negacion(booleano : Boolean) : Boolean = !booleano


fun main (args: Array<String>) {
    var numero : Int
    println(" Introduzca numero: ")
    numero = readLine()!!.toInt()

    println("El sumatorio de $numero es: ${sumatorio(numero)}")
    println("El factorial de $numero es: ${factorial(numero)}")
}

// funcion que no retorna datos
// es el tipo void que en Kotlin se usa el tipo Unit

// escribir escribe desde 1 hasta el numero
// formato normal
fun escribir (numero : Int) {
    for (i in 1..numero) {
        print("$i - ")
    }
}

// formato tipo Unit
fun escribir1 (numero : Int) : Unit{
    for (i in 1..numero) {
        print("$i - ")
    }
}