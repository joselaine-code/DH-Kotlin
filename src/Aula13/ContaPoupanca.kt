package Aula13

class ContaPoupanca(numeroDaConta: Int, saldo: Double, var limite: Double) : ContaBancaria(numeroDaConta, saldo), Imprimivel{
    override fun depositar(valor: Double) {
        saldo += valor
    }

    override fun sacar(valor: Double) {

    }

    override fun transfere(valor: Double, conta: ContaBancaria) {
        this.sacar(valor)
        conta.depositar(valor)
    }

    override fun mostrarDados() {
        println("Conta: $numeroDaConta\nSaldo: R$ $saldo\nLimite: R$ $limite")
    }

    override fun toString(): String {
        return "Conta: $numeroDaConta\nSaldo: R$ $saldo\nLimite: R$ $limite"
    }
}