package unidad23
/* clase Alumno usa constructor Básico usando var
   en la declaración de la clase
   Vamos a introducir una nueva variable de instancia y la vamos a cargar desde teclado
 */
class Alumno05 (var nombre: String ="", var curso: String = "2ºDAW", var edad: Int = 20) {
    val numero = readln()!!.toInt()
}