import kotlin.jvm.Throws

/*
Exceções são problemas na compilação e no tempo da execução do código


Objetos Nulos (null safety)
Kotlin não é permitido que as variáveis e objetos tenham valores nulo, a não ser
que isso seja explicitamente indicado no código

 */

fun main() {
    val teste = 2/0

    testeThrown()

    try {
//        resulta ArithmeticException
        val teste = 2 / 0

//        resulta NullPointerException
        val teste1: String? = null
        teste1!!.length

//      ArrayIndexOutOfBoundsException
        val teste2 = listOf(1, 2, 3)
        teste2[5]

        // tratamento de Null
        teste2.getOrNull(5)

    } catch (e: ArithmeticException) {
        println("Not a number")
    } catch (e: NullPointerException) {
        println("Variável nula")
    } catch (e: Exception) {
        println(e.localizedMessage)
    }
}
@Throws (java.lang.ArithmeticException::class)
fun testeThrown(){
    2/0
}