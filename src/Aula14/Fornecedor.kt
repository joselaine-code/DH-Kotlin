package Aula14

import java.util.*

class Fornecedor() {
    val listaDeProdutos = mutableListOf<Produto>()

    fun entrar(){
        val read = Scanner(System.`in`)
        println("Qual a descrição do Item?")
        val descricao = read.next()
        println("Qual o preço do Item?")
        val preco = read.nextDouble()
        val produto = Produto(descricao, preco)
        listaDeProdutos.forEach { println("Descrição: $descricao Preço: $preco") }
        listaDeProdutos.add(produto)
        entrar()

    }

}

fun main() {
    val fornecedor = Fornecedor()

    fornecedor.entrar()
}