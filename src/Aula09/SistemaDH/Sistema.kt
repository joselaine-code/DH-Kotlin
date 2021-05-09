package Aula09.SistemaDH

fun main() {
    var f = Aluno(32655, "Fernando", "Albuquerque")
    val aula1 = Aula(Materia("Boas Práticas em Java"), 19, 22)
    val aula2 = Aula(Materia("Reciclyer View"), 19, 22)
    var android = Curso("Mobile Android", listOf(aula1, aula2), listOf(f))
    val eduardo = Professor("Eduardo Misina", 326565)

    android.exibirAulas()


}