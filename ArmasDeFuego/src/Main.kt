import kotlin.random.Random

fun main() {
    // Lista de armas de fuego
    val armas = listOf(
        Pistola(6, 1, "9mm"),
        Rifle(10, 2, "5.56mm"),
        Bazooka(5, 3, "70mm"))
    // Lista de otros objetos que pueden disparar
    val otrosObjetos = listOf(Casa(), Coche(), Bocadillo())

    println("\nMunición extra = ${ArmaDeFuego.cantidadMunicionExtra} para todas las armas de fuego.\n")

    val disparos = (1..12).map { armas.random() to (1..3).random() }

    println("Comienzo disparos -- PIUM PIUM")
    var indice = 1
    for (disparo in disparos) {
        println()
        println("Disparo: $indice ")
        indice++
        for (i in 1..disparo.second){
            disparo.first.dispara()
            disparo.first.mostrarInfo()
        }
    }

    println("\nDisparos de otros objetos:\n")

    // disparos de otros objetos
    otrosObjetos.forEach { it.dispara() }
}