package Aula13

class ContaPoupanca(numeroDaConta: Int, saldo: Double = 0.0, var limite: Double) : ContaBancaria(numeroDaConta, saldo),
    Imprimivel {
    override fun depositar(valor: Double) {
        saldo += valor
    }

    override fun sacar(valor: Double) {
        val saldoTotal = saldo + limite
        if (valor > saldoTotal) {
            println("Saldo insuficiente")
        } else {
            saldo -= valor
            println("Saque executado com sucesso")
        }
    }

    override fun mostrarDados() {
        println("Conta Poupança nº: $numeroDaConta\nSaldo: R$ $saldo\nLimite: R$ $limite\n")
    }

    override fun toString(): String {
        return "Conta Poupança nº: $numeroDaConta\nSaldo: R$ $saldo\nLimite: R$ $limite"
    }
}