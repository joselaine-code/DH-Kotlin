package Aula07.Exercicio05

class Cliente(
    val nome: String,
    val sobrenome: String,
    val contato: Int
) {

    override fun toString(): String {
        return "$nome $sobrenome"
    }
}