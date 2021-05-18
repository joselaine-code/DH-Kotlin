package Aula11.Exercicio

class Documento : Imprimivel {
    override val nome: String
        get() = "documento"
    override val tipoDeDocumento: String
        get() = "word"

    override fun imprimir() {
        println("Eu sou um $nome $tipoDeDocumento")
    }
}