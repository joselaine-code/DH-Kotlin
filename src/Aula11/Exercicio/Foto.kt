package Aula11.Exercicio

class Foto : Imprimivel {
    override val nome: String
        get() = "foto"
    override val tipoDeDocumento: String
        get() = "selfie"

    override fun imprimir() {
        println("Eu sou uma $nome $tipoDeDocumento")
    }
}