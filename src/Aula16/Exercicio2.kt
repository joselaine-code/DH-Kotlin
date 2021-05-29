package Aula16

fun main() {
    val listaVazia = mutableListOf<Int>()
    listaVazia.add(1)
    listaVazia.add(5)
    listaVazia.add(5)
    listaVazia.add(6)
    listaVazia.add(7)
    listaVazia.add(8)
    listaVazia.add(8)
    listaVazia.add(8)

    println(listaVazia)

    val conjuntoVazio = mutableSetOf<Int>()
    conjuntoVazio.add(1)
    conjuntoVazio.add(5)
    conjuntoVazio.add(5)
    conjuntoVazio.add(6)
    conjuntoVazio.add(7)
    conjuntoVazio.add(8)
    conjuntoVazio.add(8)
    conjuntoVazio.add(8)

    println(conjuntoVazio)
}