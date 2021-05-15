package Aula10.Exercicio

class CamaroteSuperior(val localizacao:String, val acrescimoCamarote: Double = 5.0) :
    Vip() {

        fun valorIngresso(){
            val total = valor + acrescimo + acrescimoCamarote
            println("O valor do ingresso é $total")
        }
}