package tema23

fun main(args: Array<String>) {
    val alumno : Alumno = Alumno("jaime","2daw",21)

    println("Nombre: ${alumno.nombre},curso: ${alumno.curso},edad: ${alumno.edad}")

    alumno.nombre = "Juan"
    alumno.curso = "2daw"
    alumno.edad = 19

    println("Nombre: ${alumno.nombre},curso: ${alumno.curso},edad: ${alumno.edad}")

    val alumno02 = Alumno02("jaime","2daw",21)
    println("Nombre: ${alumno02.nombre},curso: ${alumno02.curso},edad: ${alumno02.edad}")

    val alumno03 = Alumno03()
    println("Nombre: ${alumno03.nombre},curso: ${alumno03.curso},edad: ${alumno03.edad}")

    val alumno04 = Alumno04("jaime","2daw",21)
    println("Nombre: ${alumno04.nombre},curso: ${alumno04.curso},edad: ${alumno04.edad}")
}