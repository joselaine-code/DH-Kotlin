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
        when (readLine()?.toIntOrNull()) {
            1 -> {
                println("Qual conta deseja criar? (CC/CP)")
                val opcaoConta = readLine()
                println("Qual o número da conta?")
                val nConta = readLine()?.toInt()
                println("Qual o saldo inicial?")
                val saldo = readLine()?.toDouble()
                if (opcaoConta == "CC") {
                    inserirConta(ContaCorrente(nConta!!, saldo!!, 3.0))
                    println("Conta $nConta criada com sucesso!")
                } else if (opcaoConta == "CP") {
                    println("Qual o limite da conta?")
                    val limite = readLine()?.toDouble()
                    inserirConta(ContaPoupanca(nConta!!, saldo!!, limite!!))
                    println("Conta $nConta criada com sucesso!")
                }
            }

            // VERIFICAR FUNÇÃO POR FUNÇÃO
            2 -> {
                println("Qual o número da conta que deseja selecionar?")
                val conta = readLine()?.toInt()
                val contaSelecionada: ContaBancaria? = contas.find { it.numeroDaConta == conta }
                if (contaSelecionada != null) {
                    println("-------------------------------------------------------")
                    println("               Conta $conta selecionada                ")
                    println("-------------------------------------------------------")
                    println("a) Depositar")
                    println("b) Sacar")
                    println("c) Transferir")
                    println("d) Gerar Relatório")
                    println("e) Retornar ao menu")
                    println("-------------------------------------------------------")
                    print("Digite uma opção:")
                    val opcao = readLine()?.lowercase()
                    when (opcao) {
                        "a" -> {
                            println("Qual valor deseja depositar?")
                            val valor = readLine()?.toDouble()
                            if (valor != null) {
                                contaSelecionada.depositar(valor)
                            }
                        }
                        "b" -> {
                            println("Qual valor deseja sacar?")
                            val valor = readLine()?.toDouble()
                            if (valor != null) {
                                contaSelecionada.sacar(valor)
                            } else {
                                println("Valor incorreto!")
                            }
                        }

                        "c" -> {
                            println("Para qual conta deseja transferir?")
                            val conta = readLine()?.toInt()
                            val contaDestino: ContaBancaria? = contas.find { it.numeroDaConta == conta }
                            if (contaDestino != null) {
                                print("Qual valor deseja transferir? R$")
                                val valor = readLine()?.toDouble()
                                if (valor != null) {
                                    contaSelecionada.transfere(valor, contaDestino)
                                    println("saldo inicial: ${contaSelecionada.saldo}")
                                    println("Transferência da conta ${contaSelecionada.numeroDaConta} para ${contaDestino.numeroDaConta} no valor de R$ $valor")
                                    println("saldo final: ${contaSelecionada.saldo}")
                                }
                            }
                        }
                        "d" -> println(contaSelecionada)

                        "e" -> exibirMenu()
                    }
                }
            }

            3 -> {
                println("Qual o número da conta que deseja remover?")
                val conta = readLine()?.toInt()
                val contaSelecionada: ContaBancaria? = contas.find { it.numeroDaConta == conta }
                if (contaSelecionada != null) {
                    removerConta(contaSelecionada)
                    println("Conta $conta removida com sucesso!")
                    contas.forEach { println(it) }
                } else {
                    println("Conta não localizada!")
                }
            }

            4 -> {
                println("Relatório de contas do DH Bank")
                println("------------------------------")
                contas.forEach { println(it) }
            }

            5 -> {
                println("Finalizando sistema...")
            }

        }
    }
}











