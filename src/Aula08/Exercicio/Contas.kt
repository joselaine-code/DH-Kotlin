package Aula08.Exercicio

abstract class Contas(
    val cliente: Cliente,
    var saldo: Double
) {

    open fun depositar(valor: Double) {
        saldo += valor
    }

    open fun sacar(valor: Double) {

    }

    open fun consultarSaldo() {
        println(this.saldo)
    }

}