package Aula09.SistemaDH

class Aula(
     val materia: Materia,
    private val horarioInicio: String,
    private val horarioFim: String,
) {

    override fun toString(): String {
        return materia.nome
    }
}