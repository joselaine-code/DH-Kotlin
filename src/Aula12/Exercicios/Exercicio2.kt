package Aula12.Exercicios

class Coca(
    val tamanho: Int,
    val preco: Double
) {
    override fun equals(other: Any?): Boolean {
        val otherCoca = other as? Coca
        return when (other) {
            is Coca -> {
                this.tamanho == otherCoca?.tamanho
            }
            else -> {
                super.equals(other)
            }
        }
    }
}

fun main() {
    val coca = Coca(125,3.50)
    val coca1 = Coca(125,4.50)

    if (coca == coca1){
        println("São Iguais")
    } else {
        println("São diferentes")
    }
}