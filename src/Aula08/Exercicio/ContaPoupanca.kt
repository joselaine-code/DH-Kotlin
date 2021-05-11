package Aula08.Exercicio

class ContaPoupanca(
    cliente: Cliente,
    saldo: Double,
    val juros: Double
) : Contas(cliente, saldo) {

    override fun sacar(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
            println("Saque realizado com sucesso!")
        }
    }

    fun recolherJuros() {
        var totalJuros = saldo * (juros / 100)
        println("Juros recolhidos no valor de R$ $totalJuros")
    }
}