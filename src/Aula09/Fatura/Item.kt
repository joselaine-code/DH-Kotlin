package Aula09.Fatura

class Item(
    private val numeroDoItem: Int,
    private val descricao: String,
    var quantidade: Int,
    var preco: Double
) {

    init {
        if (quantidade < 0) {
            quantidade = 0
        }
        if (preco < 0) {
            preco = 0.0
        }
    }
}