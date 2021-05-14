package Aula09.SistemaDH

fun main() {
    var f = Aluno(32655, "Fernando", "Albuquerque")
    var d = Aluno(32655, "Douglas", "Antaris")
    val aula1 = Aula(Materia("Boas Práticas em Java"), "19", "22")
    val aula2 = Aula(Materia("Reciclyer View"), "19", "22")
    val eduardo = Professor("Eduardo Misina", 326565)
    val materia1 = Materia("Metodologias Ágeis")
    var android = Curso("Mobile Android", arrayListOf(aula1, aula2), arrayListOf(f), eduardo)

//    android.inserirAluno(d)
    android.exibirAlunos()
    android.exibirAulas()
   println(d.getNome)

    println( materia1.toString())



}