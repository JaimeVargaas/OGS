package unidad26
/* tenemos la clase Boxeador (nombre,  pegados, recibidos)

Queremos hacer la clase combate que tiene dos boxedores y no pide puñetazo y le suma a cada en su sitio

Suponemos que se 10 golpes

 */
fun main(args : Array<String>) {

        val boxeador1 = Boxeador("Juanito")
        val boxeador2 = Boxeador("Urtain")

        val pelea = Pelea(boxeador1, boxeador2)

        pelea.jugar(10)

        println(boxeador1.toString())
        println(boxeador2.toString())

    
}