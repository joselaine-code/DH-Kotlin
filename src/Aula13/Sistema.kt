package Aula13

fun main() {
    val c1 = ContaCorrente(2356, 150.00, 2.00)
    val c2 = ContaPoupanca(5698, 150.00, 200.00)
    val c3 = ContaPoupanca(2655, 150.00, 200.00)
    val relatorio = Relatorio()

    c1.depositar(50.00)
    c2.depositar(50.00)
//    c1.sacar(130.00)
//    c2.sacar(360.00)
//
//    relatorio.gerarRelatorio(c1)
//    relatorio.gerarRelatorio(c2)

    val banco = Banco(arrayListOf())

    banco.inserirConta(c1)
    banco.inserirConta(c2)
    banco.inserirConta(c3)
    println(banco.localizarConta(c2))

    banco.exibirMenu()
}