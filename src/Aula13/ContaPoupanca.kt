package Aula13

class ContaPoupanca(numeroDaConta: Int, saldo: Double = 0.0, var limite: Double) : ContaBancaria(numeroDaConta, saldo),
    Imprimivel {
    override fun depositar(valor: Double) {
        saldo += valor
    }

    override fun sacar(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
            println("Saque realizado com sucesso!")
        } else if (saldo < valor && valor >= (saldo + limite)) {
            var utilizadoLimite = valor - saldo
            saldo = 0.0
            limite -= utilizadoLimite
            println("Saque do limite especial da conta!")
        } else {
            println("Saldo insuficiente")
        }
    }

    override fun mostrarDados() {
        println("Conta: $numeroDaConta\nSaldo: R$ $saldo\nLimite: R$ $limite\n")
    }

    override fun toString(): String {
        return "Conta: $numeroDaConta\nSaldo: R$ $saldo\nLimite: R$ $limite"
    }
}