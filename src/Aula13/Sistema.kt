package Aula13

fun main() {
    val c1 = ContaCorrente(2356, 150.00, 2.00)
    val c2 = ContaPoupanca(5698, 150.00, 200.00)

    c1.depositar(50.00)
    c2.depositar(50.00)
    c1.sacar(130.00)
    c2.sacar(360.00)

}

