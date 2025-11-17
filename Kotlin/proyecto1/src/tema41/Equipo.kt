package unidad41
data class Equipo (var nombre : String, var partidos : Int, var golesMarcados : Int, var golesEncajados: Int) {
    fun anotarGoles(vararg goles : Int) {
        for (gol in goles) {
            if (gol > 0)
                this.golesMarcados += gol
            else
                this.golesEncajados -= gol
        }
    }

}