package Aula13

class ContaCorrente(numeroDaConta: Int, saldo: Double, var taxaDeOperacao: Double) : ContaBancaria(numeroDaConta, saldo),  Imprimivel {

    override fun depositar(valor: Double) {
        saldo += (valor - taxaDeOperacao)
    }

    override fun sacar(valor: Double) {
        if (valor >= (saldo + taxaDeOperacao)){
            saldo -= (valor - taxaDeOperacao)
            println("Saque de R$ $valor realizado com sucesso.")
        } else {
            println("Saldo insuficiente.")
        }
    }

    override fun transfere(valor: Double, conta: ContaBancaria) {
        this.sacar(valor)
        conta.depositar(valor)
    }

    override fun mostrarDados() {
        println("Conta: $numeroDaConta\nSaldo: R$ $saldo")
    }

    override fun toString(): String {
        return "Conta: $numeroDaConta\nSaldo: R$ $saldo"
    }
}