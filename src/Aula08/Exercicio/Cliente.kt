package Aula08.Exercicio

class Cliente(
    val numeroCliente: String,
    val sobrenome: String,
    val cpf: Int,
    val rg: Int
) {

    override fun toString(): String {
        return "$numeroCliente $sobrenome"
    }
}