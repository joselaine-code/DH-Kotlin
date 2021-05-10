package Aula09.SistemaDH

class Aluno(
    private val ra: Int,
    private val nome: String,
    private val sobrenome: String
) {

    fun assistirAula(aula: Aula) {
        println("Estou assistindo a aula ($aula.nome)")
    }

    fun fazerLicoesDeCasa() {
        println("Fazendo lições da DigitalHouse")
    }

    override fun toString(): String {
        return "$nome $sobrenome"
    }
}