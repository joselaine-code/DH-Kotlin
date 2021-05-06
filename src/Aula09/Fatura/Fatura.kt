package Aula09.Fatura

class Fatura(
    val listaItens: List<Item>
    ){

    fun getTotalFatura(){
        var total = 0.0
        listaItens.forEach { total += it.quantidade * it.preco }
        println("O total da sua compra é R$ $total")
    }

}
fun main() {
    var sabonete = Item(1, "Sabonete Jhonson", 10,3.50)
    var pedido1 = Fatura(listOf(sabonete))

    pedido1.getTotalFatura()

}