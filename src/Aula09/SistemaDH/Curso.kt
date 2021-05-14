package Aula09.SistemaDH

class Curso(
    private val nome: String,
    private val listaDeAulas: ArrayList<Aula>,
    private val listaDeAlunos: ArrayList<Aluno>,
    private val professorResponsavel: Professor
) {

    fun inserirAluno(aluno: Aluno){
        listaDeAlunos.add(aluno)
        println("Aluno: ${aluno.getNome}")
    }

    fun adicionarAula(aula: Aula){
        listaDeAulas.add(aula)
        println("Aluno: ${aula.materia.nome}")

    }

    fun exibirAlunos(){
        println("Lista de alunos do curso $nome")
        listaDeAlunos.forEach { println(it) }
    }

    fun exibirAulas(){
        println("Lista do aulas do curso $nome")
        listaDeAulas.forEach { println(it) }
    }

}