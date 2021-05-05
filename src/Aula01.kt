fun main() {
    //Variáveis
    // val - imutável - não é possível alterar
    // var - mutável - é possível alterar

    //inteiro
    val inteiro = 1
    //long
    val numeroUltraGrande = 3249848454654613
    //string
    val texto = "Alunos da DH 2021"
    //boolean
    val abertoOuFechado = true
    //float
    val decimal = 2.5f

    // criação de lista imutável
    var pets = listOf<String>("Bica", "Mada", "Gudan")
    // criação de lista mutável
    var petsMutavel = mutableListOf<String>("Lola", "Kilica")
    petsMutavel.add("Blant")

    val numero = 2
    /*
    Estruturas Condiconais
     */
    //estrutura if
    if (numero > 3) {
        println("a")
    } else if (numero < 3){
        println("b")
    } else if (numero == 2){
        println("c")
    }

    // estrutura When
    when(numero){
        1 -> println("O número é 1")
        2 -> println("O número é 1")
        3 -> println("O número é 1")
        4 -> println("O número é 1")
        5 -> println("O número é 5")
    }
    /*
    Estruturas de Repetição
     */

    //For
    for(num in 1..2){
        println(num)
    }

    petsMutavel.forEach { pet -> println(pet) }

    //While
    var x =1
    while(x > 3){
        println(x)
        x++
    }

}