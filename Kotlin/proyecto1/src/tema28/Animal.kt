package unidad28

class Animal  (especie: String, familia: String, var nombre : String) {
    var especie = especie
    set(value) {
        field = "Especie: " + value
    }


    var familia = familia
        get() = "fam. " + field

    override fun toString () : String = "Especie: ${this.especie} Familia: ${this.familia} Nombre: ${this.nombre}"

}