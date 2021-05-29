package Aula16
import Aula13.ContaCorrente
import java.text.NumberFormat
import java.util.*

/*
    Extension Functions

    É a capacidade de estender uma classe com novas funcionalidades sem precisar herdar uma classe
    ou usar padrão de design


    Inline Functions diz para o compilador para copiar funções e parametros

 */

fun main(){
    val nome: String = "Cesar Rodrigues"
    nome.colocarSobrenome("Fernandes")

    val cesarItau = ContaCorrente(123, 250.0, 2.0)
    cesarItau.depositar(500.0)
    cesarItau.printarSaldo()

    println("Digite um número:")
    val number = readLine()?.toDouble()
    val dezReais = 10.0
    println(number?.formatarParaReal())

    val numero1 = 10
    numero1.formatarInteiro()
}

fun String.colocarSobrenome(lastName: String){
    println("$this $lastName")
}

fun ContaCorrente.printarSaldo(){
    println("O saldo é R$ ${this.saldo}")
}

fun Double.formatarParaReal(): String {
    val numberFormat = NumberFormat.getCurrencyInstance(Locale("pt", "br"))
    return numberFormat.format(this)
}

fun Int.formatarInteiro(){
    println("$this,00")
}