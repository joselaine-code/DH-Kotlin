package Aula07.Exercicio05

class Concessionaria {
    var listaDeVenda = mutableListOf<Venda>()

    fun registrarVenda(venda: Venda) {
        listaDeVenda.add(venda)
    }
}