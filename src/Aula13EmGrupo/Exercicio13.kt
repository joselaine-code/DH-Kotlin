package Aula13EmGrupo

abstract class ContaBancaria(val numeroDaConta: Int, var saldo: Double = 0.0) {
    abstract fun depositar(valorDeposito: Double)
    abstract fun sacar(saqueConta: Double)
    fun transfere(valor: Double, conta: ContaBancaria?) {
        this.sacar(valor)
        conta?.depositar(valor)
    }
}

class ContaCorrente(numeroDaConta: Int, saldo: Double = 0.0, val taxaDeOperacao: Double) :
    ContaBancaria(numeroDaConta, saldo), Imprimivel {
    override fun depositar(valorDeposito: Double) {
        saldo += valorDeposito - taxaDeOperacao
    }

    override fun sacar(saqueConta: Double) {
        if (saqueConta <= (saldo + taxaDeOperacao)) {
            saldo -= saqueConta - taxaDeOperacao
        } else {
            println("Saldo insuficiente!")
        }
    }

    override fun mostrarDados() {
        println("Número da conta: ${this.numeroDaConta}\nSaldo: ${this.saldo}\nTaxa de Operação: ${this.taxaDeOperacao}")
    }

    override fun toString(): String {
        return "Número da conta: ${this.numeroDaConta}\nSaldo: ${this.saldo}\nTaxa de Operação: ${this.taxaDeOperacao}"
    }
}

class ContaPoupanca(numeroDaConta: Int, saldo: Double = 0.0, var limite: Double) : ContaBancaria(numeroDaConta),
    Imprimivel {
    override fun depositar(valorDeposito: Double) {
        saldo += valorDeposito
    }

    override fun sacar(saqueConta: Double) {
        val saldoTotal = saldo + limite
        if (saqueConta > saldoTotal) {
            println("Saldo insuficiente")
        } else {
            saldo -= saqueConta
            println("Saque executado com sucesso")
        }
    }

    override fun mostrarDados() {
        println("Número da conta: ${this.numeroDaConta}\nSaldo: ${this.saldo}\nLimite: ${this.limite}")
    }

    override fun toString(): String {
        return "Número da conta: ${this.numeroDaConta}\nSaldo: ${this.saldo}\nLimite: ${this.limite}"
    }
}

interface Imprimivel {
    fun mostrarDados()
}

class Relatorio {
    fun gerarRelatorio(imprimivel: Imprimivel) {
        imprimivel.mostrarDados()
    }
}

fun main() {
    val c1 = ContaCorrente(1235, 0.0, 2.0)
    val c2 = ContaPoupanca(1236, 0.0, 100.0)
    val relatorio = Relatorio()


    c1.depositar(100.0)
    c2.depositar(100.0)

    c1.sacar(100.0)
    c2.sacar(150.0)

    relatorio.gerarRelatorio(c1)
    relatorio.gerarRelatorio(c2)

    val banco = Banco()
    banco.inserirConta(c1)
    banco.inserirConta(c2)

    banco.exibirMenu()


}

class Banco : Imprimivel {

    var contas = mutableListOf<ContaBancaria>()

    fun inserirConta(contaBancaria: ContaBancaria) {
        contas.add(contaBancaria)
        println("Conta inserida com sucesso")
    }

    fun removerConta(conta: ContaBancaria) {
        if (contas.contains(conta)) {
            contas.remove(conta)
            println("${conta.numeroDaConta} removida com sucesso!")
        } else {
            println("Conta não localizada")
        }
    }

    fun procurarConta(numeroConta: Int): ContaBancaria? {
        for (i in contas) {
            if (i.numeroDaConta == numeroConta) return i
        }
        return null
    }

    override fun mostrarDados() {
        contas.forEach { println(it) }
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
                println("Qual o tipo de conta você deseja criar? (CC/CP)")
                val opcao = readLine().toString()
                if (opcao == "CC" || opcao == "cc") {
                    val numero = contas.last().numeroDaConta + 1
                    val contaCorrente = ContaCorrente(numero, taxaDeOperacao = 2.00)
                    inserirConta(contaCorrente)
                    println("Conta ${contaCorrente.numeroDaConta} inserida com sucesso!")
                } else if (opcao == "CP" || opcao == "cp") {
                    val numero = contas.last().numeroDaConta + 1
                    val contaPoupanca = ContaPoupanca(numero, limite = 100.00)
                    inserirConta(contaPoupanca)
                    println("Conta ${contaPoupanca.numeroDaConta} inserida com sucesso!")
                } else {
                    println("Opção inválida!")
                    exibirMenu()
                }
            }

            2 -> {
                println("Qual conta você deseja selecionar?")
                val numeroDaConta = readLine()?.toIntOrNull()
                val contaEscolhida: ContaBancaria? = contas.find { it.numeroDaConta == numeroDaConta }
                if (contaEscolhida != null) {
                    println("----------------------------------------")
                    println(" Conta ${contaEscolhida.numeroDaConta} selecionada")
                    println("----------------------------------------")
                    println("a) Depositar")
                    println("b) Sacar")
                    println("c) Transferir")
                    println("d) Relatorio da Conta")
                    println("e) Retornar ao menu anterior")
                    println("----------------------------------------")
                    print("Digite a opção desejada: ")
                    when (readLine()) {
                        "a", "A" -> {
                            print("Qual o valor você deseja depositar? ")
                            val valor = readLine()?.toDoubleOrNull()
                            if (valor != null) {
                                contaEscolhida.depositar(valor)
                            } else {
                                println("Valor incorreto")
                            }
                        }
                        "b", "B" -> {
                            print("Qual o valor você deseja sacar? ")
                            val valor = readLine()?.toDoubleOrNull()
                            if (valor != null) {
                                contaEscolhida.sacar(valor)
                            } else {
                                println("Valor incorreto")
                            }
                        }

                        "c", "C" -> {
                            print("Qual o valor você deseja transferir? ")
                            val valor = readLine()?.toDoubleOrNull()
                            print("Qual a conta de destino? ")
                            val numeroDaConta = readLine()?.toIntOrNull()
                            val contaDestino: ContaBancaria? = contas.find { it.numeroDaConta == numeroDaConta }
                            if (contaDestino != null && valor != null){
                                contaEscolhida.transfere(valor, contaDestino)
                            } else {
                                println("Ocorreu um erro!")
                                exibirMenu()
                            }
                        }

                        "d", "D" -> {
                           println(contaEscolhida)
                        }

                        "e", "E" -> {
                            exibirMenu()
                        }

                        else -> {
                            println("Opção inválida")
                            exibirMenu()
                        }
                    }

                } else {
                    println("Conta não localizada!")
                    exibirMenu()
                }


            }

            3 -> {
                println("Qual conta você deseja remover?")
                val numeroDeConta = readLine()?.toInt()
                val contaSelecionada: ContaBancaria? = contas.find { it.numeroDaConta == numeroDeConta }
                if (contaSelecionada != null) {
                    removerConta(contaSelecionada)
                } else {
                    println("Conta não localizada!")
                }
            }

            4 -> {
                contas.forEach { println(it) }
            }

            5 -> {
                println("Finalizando sistema...")
            }
        }
        exibirMenu()
    }
}







