package Aula09.SistemaDH

class Aluno(
    private val ra: Int,
    private var nome: String,
    private var sobrenome: String,

    ) {
    val getNome: String = nome
    val getSobrenome: String = sobrenome

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