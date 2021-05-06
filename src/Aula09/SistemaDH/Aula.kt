package Aula09.SistemaDH

class Aula(
    val materia: Materia,
    val horarioInicio: Int,
    val horarioFim: Int,
) {

    override fun toString(): String {
        return materia.nome
    }
}