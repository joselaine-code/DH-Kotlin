package Aula13

import java.util.*

class Banco(
    var contas: ArrayList<ContaBancaria>
) : Imprimivel {

    override fun mostrarDados() {
        contas.forEach {
            if (it is ContaCorrente) it.mostrarDados() else if (it is ContaPoupanca) it.mostrarDados()
        }
    }

    fun inserirConta(conta: ContaBancaria) {
        contas.add(conta)
        println("Conta ${conta.numeroDaConta} inserida com sucesso!")
    }

    fun removerConta(conta: ContaBancaria) {
        if (contas.contains(conta)) {
            contas.remove(conta)
            println("Conta ${conta.numeroDaConta} removida com sucesso!")
        } else {
            println("Conta não localizada")
        }

    }

    fun localizarConta(numero: Int): ContaBancaria? {
        return contas.find { it.numeroDaConta == numero }
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
                print("Qual o tipo de conta você deseja criar? (CC/CP) ")
                val opcao = readLine().toString().lowercase(Locale.getDefault())
                if (opcao == "cc") {
                    val numeroConta: Int = if (contas.isEmpty()) {
                        0
                    } else {
                        contas.last().numeroDaConta + 1
                    }
                    val contaCorrente = ContaCorrente(numeroConta, taxaDeOperacao = 2.00)
                    inserirConta(contaCorrente)
                } else if (opcao == "cp") {
                    var numeroConta: Int = if (contas.isEmpty()) {
                        0
                    } else {
                        contas.last().numeroDaConta + 1
                    }
                    val contaPoupanca = ContaPoupanca(numeroConta, limite = 100.00)
                    inserirConta(contaPoupanca)
                } else {
                    println("Opção inválida!")
                    exibirMenu()
                }
            }

            2 -> {
                print("Qual o número da conta que deseja selecionar? ")
                val conta = readLine()?.toInt()
                val contaSelecionada = conta?.let { localizarConta(it) }
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
                    print("Digite uma opção: ")
                    val opcao = readLine()?.lowercase()
                    when (opcao) {
                        "a" -> {
                            print("Qual valor deseja depositar? ")
                            val valor = readLine()?.toDouble()
                            if (valor != null) {
                                contaSelecionada.depositar(valor)
                            } else {
                                println("Valor incorreto!")
                            }
                        }
                        "b" -> {
                            print("Qual valor deseja sacar? ")
                            val valor = readLine()?.toDouble()
                            if (valor != null) {
                                contaSelecionada.sacar(valor)
                            } else {
                                println("Valor incorreto!")
                            }
                        }

                        "c" -> {
                            print("Para qual conta deseja transferir? ")
                            val conta = readLine()?.toInt()
                            val contaDestino = conta?.let { localizarConta(it) }
                            if (contaDestino != null) {
                                print("Qual valor deseja transferir? R$")
                                val valor = readLine()?.toDouble()
                                if (valor != null) {
                                    contaSelecionada.transfere(valor, contaDestino)
                                    println("Transferência da conta ${contaSelecionada.numeroDaConta} para ${contaDestino.numeroDaConta} no valor de R$ $valor")
                                } else {
                                    println("Valor incorreto!")
                                }
                            } else {
                                println("Conta inexistente!")
                            }
                        }
                        "d" -> println(contaSelecionada)

                        "e" -> exibirMenu()
                    }
                } else {
                    println("-------------------------------------------------------")
                    println("Conta não localizada")
                }
            }

            3 -> {
                print("Qual o número da conta que deseja remover? ")
                val conta = readLine()?.toInt()
                val contaSelecionada = conta?.let { localizarConta(it) }
                if (contaSelecionada != null) {
                    removerConta(contaSelecionada)
                } else {
                    println("Conta não localizada!")
                }
            }

            4 -> {
                println("-------------------------------------------------------")
                println("            Relatório de contas do DH Bank             ")
                println("-------------------------------------------------------")
                contas.forEach {
                    if (it is ContaCorrente) it.mostrarDados() else if (it is ContaPoupanca) it.mostrarDados()
                }
            }

            5 -> {
                println("Finalizando sistema...")
            }

            else -> {
                println("-------------------------------------------------------")
                println("Opção inválida")
                exibirMenu()
            }
        }
    }
}