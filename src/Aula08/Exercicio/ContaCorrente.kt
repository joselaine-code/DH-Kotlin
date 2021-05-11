package Aula08.Exercicio

class ContaCorrente(
    var chequeEspecial: Double,
    cliente: Cliente,
    saldo: Double
) : Contas(cliente, saldo) {

    fun depositarCheque(cheque: Cheque) {
        println("Cheque de ${cheque.bancoEmissor} no valor de R$ ${cheque.valor} depositado.")
    }

    override fun sacar(valor: Double) {
        if (valor <= saldo) {
            println("Saque de R$ $valor realizado com sucesso")
        } else if (valor <= (saldo + chequeEspecial)) {
            saldo = 0.0
            val chequeUtilizado = valor - (saldo + chequeEspecial)
            chequeEspecial -= valor
            println("Saque de R$ $valor realizado com sucesso (foi utilizado R$ $chequeUtilizado)")
        } else {
            println("Saldo insuficiente!")
        }
    }
}

fun main() {
    val cliente1 = Cliente("Joselaine", "Aparecida", 43633333, 5555)
    val c1 = ContaCorrente(300.0, cliente1, 300.0)
    val c2 = ContaPoupanca(cliente1, 200.0, 1.0)
    c1.depositar(300.0)
    c1.sacar(1.0)
    c1.depositarCheque(Cheque(200.0, "Banco do Brasil", "20/06/2021"))
    c2.recolherJuros()
}