package Aula09.SistemaDH

class Professor(
    private val nome: String,
    private val rd: Int
) : Docente {
    override fun darAulas(aula: Aula) {
        println("Ministrando aula de ${aula.materia.nome}")

    }

    override fun fazerChamada() {
        println("Realizando chamada...")

    }
}