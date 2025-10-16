package Tema18


// funcion calcular el total con IVA de una base
// suponemos que la mayoria de nuestros articulos tienen el iva a 21
fun iva(base: Float, iva:Float=21f) = base*(iva/100.0+1)

// sumar parametros
fun sumar(base : Int,n1: Int = 1, n2 : Int = 2, n3: Int = 3,n4: Int=4,n5:Int=5) =base + n1 + n2 + n3 + n4 + n5


fun main(args: Array<String>) {
    println("introduzca base")
    var base = readLine()!!.toFloat()
    println("el total IVA de $base es ${iva(base,iva=21.0f)}")

    // llamada con un parametro y el otro coge valor por defecto
    println("el total IVA de $base es ${iva(base)}")

    // llamada por nombre de parametro
    println("el total IVA de $base es ${iva(iva=21.0f,base=base)}")

    // prueba de sumar
    println("sumar con solo un parametro ${sumar(8)}")
    println("sumar con dos parametros ${sumar(8,5)}")
}
