package unidad23
// con constructor multiple
class Alumno04  (var nombre: String, var curso: String, var edad: Int) {



    constructor(): this("por defecto","por defecto",0) {
    }




    constructor(nombre : String) : this(nombre = nombre,"por defecto",0) {
        println("Introduzca curso:")
        curso = readln().toString()

        println("Introduzca edad:")
        edad = readln()!!.toInt()
    }

    constructor(nombre : String, curso : String, edad1 : Int, edad2 : Int):
            this(nombre,curso = curso, edad = Math.max(edad1,edad2),) {
    }
}