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
    val listaDeFuncionario = mutableListOf<Funcionario>()

    val funcionario = Funcionario("Jaqueline Aparecida", 1611)
    val funcionario1 = Funcionario("Eduardo", 3261)
    val funcionario2 = Funcionario("Mônica", 1605)
    val funcionario3 = Funcionario("Alexandre Aparecido", 3265)

    listaDeFuncionario.add(funcionario)
    listaDeFuncionario.add(funcionario1)
    listaDeFuncionario.add(funcionario2)
    listaDeFuncionario.add(funcionario3)

    val funcionario4 = Funcionario("Alexandre Aparecido", 3265)

    if (listaDeFuncionario.contains(funcionario4)) {
        println("Sim")
    } else {
        println("Não")
    }

}