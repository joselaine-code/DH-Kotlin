package Aula17

class CalculoMatematico {
    @Throws(java.lang.ArithmeticException::class)
    fun divisao(n1: Int, n2: Int): Int {
        if (n2 == 0) {
            throw ArithmeticException("Não é possível dividir")
        } else {
            return n1 / n2
        }

//        return try {
//            n1/n2
//        } catch (e: ArithmeticException){
//            println("Operação não pode ser realizada")
//            0
//        }

    }
}

fun main() {
    val calculo = CalculoMatematico()

    calculo.divisao(2, 0)

//    try {
//        calculo.divisao(4,0)
//    } catch (e: ArithmeticException){
//        println(e.localizedMessage)
//    }

}