package Aula13

class ContaCorrente(numeroDaConta: Int,  saldo: Double = 0.0, var taxaDeOperacao: Double) : ContaBancaria(numeroDaConta, saldo),  Imprimivel {

    override fun depositar(valor: Double) {
        saldo += (valor - taxaDeOperacao)
    }

    override fun sacar(valor: Double) {
        if (valor <= (saldo + taxaDeOperacao)){
            saldo -= (valor - taxaDeOperacao)
            println("Saque de R$ $valor realizado com sucesso.")
        } else {
            println("Saldo insuficiente.")
        }
    }

    override fun mostrarDados() {
        println("Conta Corrente nº: $numeroDaConta\nSaldo: R$ $saldo\n")
    }
}