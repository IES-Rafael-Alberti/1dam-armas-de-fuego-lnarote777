

class Pistola(nombre: String = "Pistola",
              municion: Int,
              municionARestar: Int,
              tipoMunicion: String,
              radio: String = "Reducido",
              danio: Int = (1..5).random()) : ArmaDeFuego(nombre, municion, municionARestar, tipoMunicion, ) {


}