package inicio
import tema14.factorial

fun main (args: Array<String>){
    println("Introduzca numero: ")
    var numero = readLine()!!.toInt()

    println("EL factorial de $numero es ${factorial(numero)} ")
}