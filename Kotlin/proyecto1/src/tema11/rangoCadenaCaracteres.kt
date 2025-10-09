package tema11

fun main(args: Array<String>) {
    val c1 : Char
    val c2 : Char

    println("Introduzca c1")
    c1 = readLine()!!.toCharArray()[0]

    println("Introduzca c2")
    c2 = readLine()!!.toCharArray()[0]

    println("caracteres entre $c1 y $c2")
    for (c in c1..c2) {
        print(c)
    }
}