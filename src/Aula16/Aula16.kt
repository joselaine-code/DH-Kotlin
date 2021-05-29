/*
    Collection ->

    List é uma coleção ordenada, com acesso aos itens por indice
    Set é uma coleção de elementos únicos. (Não há repetição)
    Map é um conjuto de pares valores-chaves

 */

fun main(){
    //Caso seja especificado o tipo de itens nalista, não é
    // possível aceitar outro tipo de item.
    val listaImutavel = listOf(1)
    val listaMutavel = mutableListOf("Cesar", "Edu")

    val setImutavel = setOf("Ana", "Pedro")
    val setMutavel = mutableSetOf(1,2,3,4,5)

    val mapImutavel = mapOf(
        123 to "Cesar Rodrigues",
        455 to "Edu Misina",
        321 to "Camila"
    )

    val mapMutavel = mutableMapOf(
        123 to "Eduardo",
        986 to "Fernanda",
    )
    mapMutavel.put(123,"Camila")

}