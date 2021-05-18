package Aula10.Exercicio

open class Vip(val acrescimo: Double = 10.0) : Ingreso() {
    override fun imprimeValor() {
        println("O valor do ingresso VIP é ${valor + acrescimo}")
    }
}