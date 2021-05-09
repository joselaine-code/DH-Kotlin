package Aula07.Exercicio05

class Venda(
    val valorDaVenda: Double,
    val veiculoVendido: Carro,
    val cliente: Cliente
) {

    override fun toString(): String {
        return "Veículo Vendido: $veiculoVendido\nValor da Venda: $valorDaVenda\nComprador:$cliente"
    }
}