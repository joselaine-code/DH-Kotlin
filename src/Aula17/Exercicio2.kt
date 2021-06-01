package Aula17

fun main() {
    val arrayDeStrings: MutableList<String>? = null
//    println(arrayDeStrings)
    arrayDeStrings?.add("Pato")
    arrayDeStrings?.add("Cachorro")
    arrayDeStrings?.add("Gato")

    try {
        println(arrayDeStrings!![2])
    } catch (e: NullPointerException) {
        println(e.stackTraceToString())
    }
}