package unidad18

import tema14.factorial

fun combinatorio1 (a : Int, b : Int) = factorial(a) / (factorial(b) * factorial(a-b))

fun main(args: Array<String>) {
    val n1 : Int
    val n2 : Int

    println("Introduza a: ")
    n1 = readLine()!!.toInt()


    println("Introduza b: ")
    n2 = readLine()!!.toInt()

    println("El combinatorio1 $n1 $n2 es ${combinatorio1(n1, n2)} ")
    println("El combinatorio2 $n1 $n2 es ${combinatorio2(n1, n2)} ")
}
fun combinatorio2 (a : Int, b : Int) : Int {
    fun factorial( n : Int) :Int {
        var resu : Int = 1
        for (i in 2..n) {

        }
        return resu
    }


    return factorial(a) /(factorial(b) * tema14.factorial(a-b))
}