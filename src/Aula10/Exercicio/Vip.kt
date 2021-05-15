package Aula10.Exercicio

open class Vip(val acrescimo: Double = 10.0) : Ingreso() {
    override fun imprimeValor() {
        val ingresso = valor + acrescimo
        println("O valor do ingresso é $ingresso")
    }
}