package Aula09.SistemaDH

class Aluno(
    ra: Int,
    val nome: String,
    val sobrenome: String
) {

    fun assistirAula(aula: Aula){
        println("Estou assistindo a aula ($aula.nome)")
    }

    fun fazerLicoesDeCasa(){
        println("Fazendo lições da DigitalHouse")
    }

    override fun toString(): String {
        return "$nome $sobrenome"
    }
}