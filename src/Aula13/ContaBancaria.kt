package Aula13

abstract class ContaBancaria(
    val numeroDaConta: Int,
    var saldo: Double
) {


    abstract fun depositar(valor:Double)
    abstract fun sacar(valor:Double)
    abstract fun transfere (valor:Double, conta:ContaBancaria)

}