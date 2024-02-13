/**
 * Clase base para todas las armas de fuego.
 *
 * @property nombre Nombre del arma.
 * @property municion Cantidad inicial de munición.
 * @property municionARestar Cantidad de munición a restar al disparar.
 * @property tipoDeMunicion Tipo de munición.
 * @property danio Daño del arma.
 * @property radio Radio de alcance del arma.
 */
class ArmaDeFuego(private val nombre: String,
                           private val municion: Int,
                           private val municionARestar: Int,
                           private val tipoMunicion: String, //(9mm, 7.62mm, 60mm, RPG, ... etc)
                           val radio: String, // "Reducido", "Corto", "Intermedio", "Amplio" y "Enorme"
                           val danio : Int
) {
    companion object{
        /**
         * Cantidad de munición extra compartida entre todas las armas.
         */
        private val cantidadMunicionExtra: Int = (1..5).random()
    }
    fun dispara(){}
    fun recarga(){

        println("Recarga completa. Arma recargada: $nombre, Munición actual: $municion")
    }
    open fun mostrarInfo(): String{
        return "Nombre: $nombre, Munición: $municion, Tipo de munición: $tipoMunicion, Daño: $danio, Radio: $radio"
    }


}