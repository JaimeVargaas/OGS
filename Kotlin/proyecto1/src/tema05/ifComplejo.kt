package tema05
/* vamos a pedir dos numero enteros que suponemos positivos
   si nu1 > num 2 vamos a devolver una formula num1 elevado a numero2 es ....
   en caso negativo devolvemos no se puede hacer
 */
fun main(args: Array<String>) {
    val nu1 : Int
    val nu2 : Int

    println("Introduzca nu1")
    nu1 = readLine()?.toInt() ?: 0

    println("Introduzca nu2")
    nu2 = readLine()?.toInt() ?: 0

    val cadena = if (nu1 > 0 && nu2 > 0)  {
        var resultado : Int = 1
        for (cont in 1..nu2)
            resultado *= nu1
        "Nu1 elevado a nu2 es $resultado"
    }
    else "no se puede realizar la operacion"

    println(cadena)
}