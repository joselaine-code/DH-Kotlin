package Aula09.SistemaDH

class Aula(
    private val materia: Materia,
    private val horarioInicio: Int,
    private val horarioFim: Int,
) {

    override fun toString(): String {
        return materia.nome
    }
}