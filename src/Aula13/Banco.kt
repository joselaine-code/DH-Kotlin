package Aula13

class Banco(
    var contas: ArrayList<ContaBancaria>
) : Imprimivel {

    override fun mostrarDados() {
        contas.forEach { println(it) }
    }

    fun inserirConta(conta: ContaBancaria) {
        contas.add(conta)
    }

    fun removerConta(conta: ContaBancaria) {
        contas.remove(conta)
    }

    fun localizarConta(conta: ContaBancaria): ContaBancaria? {
        return if (contas.contains(conta)) {
            conta
        } else {
            null
        }
    }

    fun exibirMenu() {
        println("-------------------------------------------------------")
        println("                       BANCO DH                        ")
        println("-------------------------------------------------------")
        println("1) Criar Conta")
        println("2) Selecionar Conta")
        println("3) Remover Conta")
        println("4) Gerar Relatório")
        println("5) Finalizar")
        println("-------------------------------------------------------")
        print("Digite a sua opção: ")
        var opcao = readLine()?.toInt()
        when (opcao) {
            1 -> println("1")
            2 -> println("2")
            3 -> {
                println("Qual conta você deseja remover?")
                var nConta = readLine()?.toInt()
                var resultado = contas.forEach { it.numeroDaConta == nConta }
                println(resultado)
            }
        }

    }
}
