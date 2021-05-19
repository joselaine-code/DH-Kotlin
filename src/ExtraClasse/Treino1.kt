fun main() {
    iniciarPrograma()
}

fun iniciarPrograma(){
    println("Qual o valor da Etiqueta?")
    val valor = readLine()?.toDoubleOrNull()
    println("Qual a modalidade de pagamento:")
    println("1) Á vista em dinheiro ou PIX (10% de desconto)")
    println("2) Á vista no cartão de crédito (5% de desconto)")
    println("3) No cartão de crédito em 2x (sem desconto)")
    println("4) No cartão de crédito em 3x (10% de juros)")
    val formaDePagamento = readLine()?.toIntOrNull()
    if (formaDePagamento in 1..4){
        if (valor != null && formaDePagamento != null) {
            programaCalculo(valor,formaDePagamento)
        }
    } else {
        println("Opção incorreta!")
    }
    println("Deseja encerrar o programa? S/N")
    val opcao = readLine().toString()
    if (opcao == "N" || opcao == "n"){
        iniciarPrograma()
    }
}


fun programaCalculo(valor: Double, formaDePagamento: Int){
    when (formaDePagamento){
        1 -> println("O valor é R$ ${valor*0.9}")
        2 -> println("O valor é R$ ${valor*0.95}")
        3 -> println("O valor é R$ $valor")
        4 -> println("O valor é R$ ${valor*1.1}")
    }
}