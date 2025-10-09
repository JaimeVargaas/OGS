package tema05
/* lee dos numeros y me devuelve verdadero si el primero es mayor que el segundo */
fun main() {
    var numero1 : Int
    var numero2 : Int
    var resultado : String

    println("Introduzca numero1:")
    numero1 = readLine()?.toInt() ?: 0

    println("Introduzca numero2:")
    numero2 = readLine()?.toInt() ?: 0

    if (numero1 >= numero2)
        println ("Primero mayor")
    else
        println ("Segundo mayor")

    resultado =  if (numero1 >= numero2){
                   println("Introduzca Texto")
                   readln().toString()}
                  else
                    "Segundo mayor"
    println(resultado)
    println(if (numero1 >= numero2) "Primero mayor"  else "Segundo mayor")
    println(" El resultado de la comparacion es: ${if (numero1 >= numero2) "Primero mayor"  else "Segundo mayor"}")
}