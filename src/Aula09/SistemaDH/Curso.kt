package Aula09.SistemaDH

class Curso(
    private val nome: String,
    private val listaDeAulas: List<Aula>,
    private val listaDeAlunos: List<Aluno>
) {

    fun exibirAlunos(){
        println("Lista do curso $nome")
        listaDeAlunos.forEach { println(it) }
    }

    fun exibirAulas(){
        println("Lista do aulas do curso $nome")
        listaDeAulas.forEach { println(it) }
    }

}