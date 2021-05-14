package Aula08.Exercicio

class ContaPoupanca(
    cliente: Cliente,
    saldo: Double,
    private val juros: Double
) : Contas(cliente, saldo) {

    override fun sacar(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
            println("Saque realizado com sucesso!")
        }
    }

    fun recolherJuros() {
        val juros = saldo * (juros / 100)
        saldo += juros
        println("Meu novo saldo é R$ $saldo")
    }
}