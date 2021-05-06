fun main() {
    val larissa = Contribuinte("F", 66, 30)

   val lista = ListaDeNumeros(listOf(5,5,5))
    println(lista.produto())

}

//1)
class Contribuinte(
    val sexo: String,
    val idade: Int,
    val tempoDeContribuicao: Int
) {

    fun aposentadoria(): Boolean {
        return if (sexo == "F" && idade >= 60 && tempoDeContribuicao >= 30) {
            true
        } else sexo == "M" && idade >= 65 && tempoDeContribuicao >= 30
    }
}

//2)
class ListaDeNumeros(
    val lista: List<Int>
){

    fun produto(): Int{
        var result: Int = 1
        for (num in lista) {
            result *= num
        }
        return result
    }
}