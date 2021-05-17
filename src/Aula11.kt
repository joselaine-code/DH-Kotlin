interface RegraDeOuro {
    // Interface possuem o objetivo de criar um contrato, onde a classe que a implementa deve obrigatoriamente
    // sobrescrever todos os métodos.
    // **úteis para não esquecer de implementar alguma coisa.**

    // INTERFACE X CLASSE ABSTRATA
    // Na classe abstrata é possível iniciar uma varíavel e guardar uma variavel, na interface não é possível (contrato
    // limpo e seco).

//    Uma interface pode herdar de outra interface

    fun calcularImposto()
    fun colherEstadoSaoPaulo()
    fun colherEstadoRio()

}

class Ceara : RegraDeOuro {
    override fun calcularImposto() {
        TODO("Not yet implemented")
    }

    override fun colherEstadoSaoPaulo() {
        TODO("Not yet implemented")
    }

    override fun colherEstadoRio() {
        TODO("Not yet implemented")
    }

}

abstract class RegraDePrata(){

    val icms = 7.0

    abstract fun calcularImposto()
    abstract fun colherEstadoSaoPaulo()
    abstract fun colherEstadoRio()
}

fun main() {
    val ceara = Ceara()

    ceara.calcularImposto()

}
