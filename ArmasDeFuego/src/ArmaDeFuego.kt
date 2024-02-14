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
open class ArmaDeFuego(
    private var nombre: String,
    private var municion: Int,
    private var municionARestar: Int,
    private var tipoMunicion: String, //(9mm, 7.62mm, 60mm, RPG, ... etc)
    val radio: String, // "Reducido", "Corto", "Intermedio", "Amplio" y "Enorme"
    val danio : Int
) {
    companion object{
        //Municion extra que se comparte entre todas las armas
        var cantidadMunicionExtra: Int = (5..15).random()
    }

    /**
     * Método para disparar el arma
     */
    fun dispara(){
        if (municion >= municionARestar){
            municion -= municionARestar
            println("$nombre ha sido disparada. Munición restante: $municion")
        }else{
            recarga()
            if (municion >= municionARestar){
                dispara()
            }else{
                println("No hay munición suficiente en el cargador.")
            }
        }
    }

    /**
     * Método para recargar el arma
     */
    fun recarga(){
        if (cantidadMunicionExtra >= (municionARestar * 2)){
            municion += municionARestar * 2
            cantidadMunicionExtra -= municionARestar * 2
            println("Recarga completa. Arma recargada: $nombre, Munición actual: $municion")
        } else if (cantidadMunicionExtra >= municionARestar){
            municion+= municionARestar
            cantidadMunicionExtra -= municionARestar
            println("Recarga completa. Arma recargada: $nombre, Munición actual: $municion")
        } else {
            println("No hay suficiente munición extra.")
        }
    }

    /**
     * Muestra la información completa de cada arma
     *
     * @return Cadena de caracteres con la información
     */
    open fun mostrarInfo(): String{
        return "Nombre: $nombre, Munición: $municion, Tipo de munición: $tipoMunicion, Daño: $danio, Radio: $radio"
    }


}


/**
 * Clase Pistola que hereda de la clase ArmaDeFuego
 *
 * @param nombre Nombre del arma ("Pistola").
 * @param municion Cantidad inicial de munición.
 * @param municionARestar Cantidad de munición a restar al disparar.
 * @param tipoMunicion Tipo de munición.
 * @param radio Radio de alcance del arma ("Reducido").
 * @param danio Daño del arma (valor aleatorio entre 1 y 5).
 *
*/
class Pistola(
    municion: Int,
    municionARestar: Int,
    tipoMunicion: String) : ArmaDeFuego("Pistola", municion, municionARestar, tipoMunicion, "Reducido", (1..5).random() )

/**
 * Clase Pistola que hereda de la clase ArmaDeFuego
 *
 * @param nombre Nombre del arma ("Rifle").
 * @param municion Cantidad inicial de munición.
 * @param municionARestar Cantidad de munición a restar al disparar.
 * @param tipoMunicion Tipo de munición.
 * @param radio Radio de alcance del arma ("Intermedio").
 * @param danio Daño del arma (valor aleatorio entre 5 y 10).
 *
 */
class Rifle(
    municion: Int,
    municionARestar: Int,
    tipoMunicion: String): ArmaDeFuego("Rifle", municion, municionARestar, tipoMunicion, "Intermedio", (5..10).random() )

/**
 * Clase Pistola que hereda de la clase ArmaDeFuego
 *
 * @param nombre Nombre del arma ("Bazooka").
 * @param municion Cantidad inicial de munición.
 * @param municionARestar Cantidad de munición a restar al disparar.
 * @param tipoMunicion Tipo de munición.
 * @param radio Radio de alcance del arma ("Enorme").
 * @param danio Daño del arma (valor aleatorio entre 10 y 30).
 *
 */
class Bazooka(
    municion: Int,
    municionARestar: Int,
    tipoMunicion: String): ArmaDeFuego("Bazooka", municion, municionARestar, tipoMunicion, "Enorme", (10..30).random() )