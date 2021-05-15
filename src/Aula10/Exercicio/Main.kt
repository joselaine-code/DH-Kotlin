package Aula10.Exercicio

fun main() {
    apresentaçãoCinema()

}

fun apresentaçãoCinema(){
    println("-----------------------------------------------")
    println("Cinema DH")
    println("-----------------------------------------------")
    println("Digite 1 para ingresso normal e 2 para ingresso VIP:")
    val opcao = readLine()?.toIntOrNull()
    if (opcao == 1){
        val n = Normal()
        n.imprimeValor()
    } else if (opcao == 2){
        println("Digite 1 para Camarote Superior e 2 para Camarote Inferior: ")
        val opcao = readLine()?.toIntOrNull()
        when (opcao){
            1 -> {
                println("Qual a localização?")
                val localizacao = readLine().toString()
                val camaroteSuperior = CamaroteSuperior(localizacao)
                println("O ingressso é Camarote Superior (localização: $localizacao)")
                camaroteSuperior.valorIngresso()
            }
            2 -> {
                println("Qual a localização?")
                val localizacao = readLine().toString()
                val camaroteInferior = CamaroteInferior(localizacao)
                println("O ingressso é Camarote Inferior)")
                camaroteInferior.imprimirLocalizao()
            }
        }
    }
}