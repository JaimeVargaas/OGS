package tema11

fun main(args: Array<String>) {
    // numeros de 10 al 1
    println("Introduzca numero: ")
    var numero = readLine()!!.toInt()


    for (c in numero downTo 1) {
        print(" $c")
    }

    // multiplos de 3 entre 0 y n
    println("Introduzca numero de multiplos: ")
    println()
    numero = readLine()!!.toInt()

    for (c in 0..numero step 3) {
        print(" $c")
    }
    println()
    println("Inverso")
    for (c in numero downTo  0 step 3) {
        print(" $c")
    }

}