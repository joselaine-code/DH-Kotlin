package Aula13

abstract class ContaBancaria(
    val numeroDaConta: Int,
    var saldo: Double = 0.0
) {

    abstract fun depositar(valor: Double)
    abstract fun sacar(valor: Double)
    fun transfere(valor: Double, conta: ContaBancaria) {
        this.sacar(valor)
        conta.depositar(valor)
    }

}