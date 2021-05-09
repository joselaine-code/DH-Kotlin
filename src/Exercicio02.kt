fun main() {
    val larissa = Contribuinte('F', 59, 30)

    larissa.aposentadoria()
    val number1 = ListaDeNumeros(listOf(2,2,2))
    number1.produto()

}

//1)
class Contribuinte(
    val sexo: Char,
    val idade: Int,
    val tempoDeContribuicao: Int
) {

    fun aposentadoria() {
        if (tempoDeContribuicao < 30) {
            println(false)
        } else if (sexo == 'F' && idade >= 60) {
            println(true)
        } else if (sexo == 'M' && idade >= 65) {
            println(true)
        } else {
            println(false)
        }
    }
}

//2)
class ListaDeNumeros(
    val lista: List<Int>
) {

    fun produto() {
        var result: Int = 1
        for (num in lista) {
            result *= num
        }
       println(result)
    }
}