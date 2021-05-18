package Aula11.Exercicio

class Contrato : Imprimivel {
    override val nome: String
        get() = "Sou"
    override val tipoDeDocumento: String
        get() = "contrato"

    override fun imprimir() {
        println("$nome um ${tipoDeDocumento} muito legal")
    }
}