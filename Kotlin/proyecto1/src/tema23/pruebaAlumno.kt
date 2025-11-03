package unidad23

fun main (args: Array<String>) {
    val alumno : Alumno01 = Alumno01("Antonio", "1DAW", 20)

    println("Nombre: ${alumno.nombre} curso: ${alumno.curso} edad: ${alumno.edad}")

    alumno.nombre = "Federico"

    println("Nombre: ${alumno.nombre} curso: ${alumno.curso} edad: ${alumno.edad}")


    val alumno02 = Alumno02("Noemi", "2DAW", 20)
    println("Nombre: ${alumno02.nombre} curso: ${alumno02.curso} edad: ${alumno02.edad}")


    var alumno03 : Alumno03 = Alumno03()
    println("0 Parametros Nombre: ${alumno03.nombre} curso: ${alumno03.curso} edad: ${alumno03.edad}")

    alumno03 = Alumno03("Jacinto")

    println("Sólo el nombre Nombre: ${alumno03.nombre} curso: ${alumno03.curso} edad: ${alumno03.edad}")

    alumno03 = Alumno03(edad = 28)

    println("edad a 28 Nombre: ${alumno03.nombre} curso: ${alumno03.curso} edad: ${alumno03.edad}")

    var alumno04 : Alumno04 = Alumno04("Adrian", "1SMR", 16)
    println("Alumno04 con parametros: ${alumno04.nombre} curso: ${alumno04.curso} edad: ${alumno04.edad}")

    alumno04 = Alumno04()
    println("Alumno04 sin parametros: ${alumno04.nombre} curso: ${alumno04.curso} edad: ${alumno04.edad}")

    alumno04 = Alumno04("Jesucito")
    println("Alumno04 con un parametros: ${alumno04.nombre} curso: ${alumno04.curso} edad: ${alumno04.edad}")

    val alumno05 : Alumno05 = Alumno05()
    println("Alumno05 con un parametros: ${alumno05.nombre} curso: ${alumno05.curso}" +
            "edad: ${alumno05.edad} numero: ${alumno05.numero}"            )

    val alumno06 : Alumno06 = Alumno06("Manolito", "2smra", 19)

    println(" To string de Alumno03 ${alumno03.toString()}")
    println(" To string de Alumno06 ${alumno06.toString()}")
}