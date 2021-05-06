package Aula09.Estoque

class Estoque (
    var nome:String,
    var qtdAtual: Int,
    var qtdMinima: Int,
        ) {

    fun mudarNome(nomeNovo:String){
        nome = nomeNovo
    }

    fun mudarQtdMinima(qtd:Int){
        if (qtd >= 0) qtdMinima = qtd else println("Quantidade mínima deve ser maior que 0 (zero)")
    }

    fun repor(qtd:Int){
        qtdAtual += qtd
    }

    fun darBaixa(qtd:Int){
        if (qtd <= qtdAtual) qtdAtual-= qtd else println("Não é possível dar baixa, seu estoque é insuficiente")
    }

    fun precisaRepor(): Boolean {
        return qtdAtual <= qtdMinima
    }

    fun mostra(): String {
        return "Produto: $nome\nQuantidade em estoque: $qtdAtual\nQuantidade mínima: $qtdMinima"
    }
}

fun main() {
    var estoque = Estoque("Sabonete",15, 5)
    estoque.mudarNome("Sabonete Avon")
    estoque.repor(15)
    println(estoque.mostra())
    println(estoque.precisaRepor())

}