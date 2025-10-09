package tema12

// pedimos una nota numérica y me devuelve un texto
// 0,1,2 MD  3,4 In 5,6 suf 7 bien 8 not 9 sob 10 MH

fun main(args: Array<String>) {
    val nota : Int
    println("Introduzca nota: ")
    nota = readLine()!!.toInt()

    when
    {
        nota < 0 -> println("Nota invalida")
        nota <= 2 -> {println("MD")}
        nota <= 4 -> println("In")
        nota <= 6 -> println("Suf")
        nota == 7 -> println("Bien")
        nota == 8 -> println("Not")
        nota == 9 -> println("Sob")
        nota == 10 -> println("MH")
        else -> println("Nota invalida")
    }

    when (nota)
    {

        in 0..2 -> {println("MD")}
        3,4 -> println("In")
        5,6 -> println("Suf")
        7 -> println("Bien")
        8 -> println("Not")
        9 -> println("Sob")
        0 -> println("MH")
        else -> println("Nota invalida")
    }

    println( when
    {
        nota < 0 -> "Nota invalida"
        nota <= 2 -> {   var nada = 5
                         nada += 2
                          "MD"}
        nota <= 4 -> ("In")
        nota <= 6 -> "Suf"
        nota == 7 -> ("Bien")
        nota == 8 -> ("Not")
        nota == 9 -> ("Sob")
        nota == 10 -> ("MH")
        else -> "Nota invalida"
    } )

    println(
        when (nota)
        {

            in 0..2 -> "MD"
            3,4 -> "In"
            5,6 -> "Suf"
            7 -> "Bien"
            8 -> "Not"
            9 -> "Sob"
            0 -> "MH"
            else -> "Nota invalida"
        }

    )
}