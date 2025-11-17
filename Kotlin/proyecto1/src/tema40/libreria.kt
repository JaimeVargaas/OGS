package unidad40

fun String.doble () : String = this + this
fun String.añadir(c : Char, tamaño : Int) : String {return this + "".padEnd(tamaño, c)}

// vamos a sobre-escribir padEnd


fun String.padEnd(tamaño : Int, c: Char = ' ') : String {return this + "patata"}