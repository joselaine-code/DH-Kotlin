package Aula17

import java.lang.IndexOutOfBoundsException

fun main() {
    val listaDeAnimais = mutableListOf<String>()
    listaDeAnimais.add("Pato")
    listaDeAnimais.add("Cachorro")
    listaDeAnimais.add("Gato")

    try{
        println(listaDeAnimais[3])
    } catch ( e: IndexOutOfBoundsException){
        println(e.stackTraceToString())
    }
}