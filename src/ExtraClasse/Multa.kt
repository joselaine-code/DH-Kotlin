package ExtraClasse

import java.util.*

fun main() {
    verificaVelocidade()
}


fun verificaVelocidade() {
    print("Informe a velocidade: ")
    val velocidade = readLine()?.toInt()
    if (velocidade != null) {
        if (velocidade >= 80) {
            val velocidadeExcedida = velocidade - 80
            println("Você foi multado! A sua multa é de R$ ${velocidadeExcedida * 3}")
        }
    }
}

