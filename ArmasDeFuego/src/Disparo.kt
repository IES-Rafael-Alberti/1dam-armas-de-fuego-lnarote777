/**
 * Clase base Disparo que haace que un objeto pueda disparar
 *
 * @property nombre Nombre del objeto
 * @property tipoDisparo Tipo de disparo del objeto
 */
open class Disparo(
    val nombre: String,
    var tipoDisparo: String
){

    /**
     * Método que hace que el objeto dispare (solo imprime)
     */
    fun dispara(){
        println("$nombre disparando $tipoDisparo")
    }
}

/**
 * Clase que representa un objeto Casa capaz de disparar confeti.
 *
 * @param nombre Nombre del objeto Casa.
 * @param tipoDisparo Tipo de disparo del objeto Casa.
 */
class Casa : Disparo("Casa", "confeti")

/**
 * Clase que representa un objeto Coche capaz de disparar ráfagas de luz larga.
 *
 * @param nombre Nombre del objeto Coche.
 * @param tipoDisparo Tipo de disparo del objeto Coche.
 */
class Coche : Disparo("Coche", "ráfagas de luz larga")

/**
 * Clase que representa un objeto Bocadillo capaz de disparar olor a jamón.
 *
 * @param nombre Nombre del objeto Bocadillo.
 * @param tipoDisparo Tipo de disparo del objeto Bocadillo.
 */
class Bocadillo: Disparo("Bocadillo", "olor a jamón")