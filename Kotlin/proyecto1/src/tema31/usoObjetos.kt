package unidad31

import unidad30.Carta
import unidad30.Figura
import unidad30.Palo

fun main (args: Array<String>) {
    println("Uso de libreria matematica")
    println("PI: ${Matematica.PI}  Numero Aleatorio: ${Matematica.aleatorio(0, 10)}")

    // construccion objeto local

    var objeto = object {
        private var nombre: String = "laura"
        fun mayuscula(): String = nombre.uppercase()
        fun asignar(valor : String) {
            nombre = valor
        }

    }


    println("Objeto local: ")
    println("Nombre ${objeto.mayuscula()}")
    objeto.asignar( readln()!!.toString())
    println("Nombre ${objeto.mayuscula()}")

}
