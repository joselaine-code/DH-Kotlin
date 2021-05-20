package Aula12.Exercicios

class Funcionario(
    val name: String,
    val registrationNumber: Int
) {
    override fun equals(other: Any?): Boolean {
        val outroFuncionario = other as? Funcionario
        return outroFuncionario?.registrationNumber == this.registrationNumber
    }
}

fun main() {
    val funcionario = Funcionario("Jaqueline Aparecida", 1611)
    val funcionario1 = Funcionario("Jaqueline Aparecida", 1611)

    if (funcionario == funcionario1) {
        println("São Iguais")
    } else {
        println("São diferentes")
    }

}