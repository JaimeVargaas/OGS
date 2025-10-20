package tema21

// rellenar array y calcular media
fun leerArray (intArray: IntArray) {
    for (con in intArray.indices) {
        intArray[con] = readLine()!!.toInt()
    }
}
fun escribirArray (intArray: IntArray) {
    for (con in intArray) {
        print (con.toString() + " -- ")
    }
}

fun media(intArray: IntArray) : Int = intArray.sum()/intArray.size

fun main(args: Array<String>) {
    // asigno posición con función lambda
    // var notas : IntArray = IntArray (5,{p : Int -> p })

    // asigno posición con función Lambda por defecto
    var notas : IntArray = IntArray (5,{ it + 1 })
    println("Asignación a posición")
    escribirArray(notas)

    println("Introduzca notas:")
    leerArray(notas)

    println("Hemos leido")
    escribirArray(notas)

    println("El sumatorio ${notas.sum()} Media ${media(notas)}")

    for((valor,indice) in notas.withIndex()){
        println("$indice - $valor")
    }

}