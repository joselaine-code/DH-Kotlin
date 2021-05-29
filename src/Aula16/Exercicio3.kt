package Aula16

class Prova{
    fun somaTotal(set: Set<Int>){
        var total =0
        set.forEach {
            total += it
        }
        println("O valor total é $total")
    }
}

fun main() {
    val prova = Prova()

    prova.somaTotal(setOf(3,2,4,5))
}