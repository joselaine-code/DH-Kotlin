
/*Equals (comparação entre objetos e Strings)
Indica se algum outro objeto é "igual a" este.

É chamado o método equals para realizar essa comparação, por default é a endereço de memoria.
 */

/*
toString sobrescreve a representação do objeto
 */

/*
HasCode retorna um valor de código hash para o objeto (representatividade do objeto na memória).

Quando não for igual pelo Equals padrão, retorna valores diferentes
Caso seja igual, retorna o mesmo valor
 */

fun main() {
    val ferrariF50 = Ferrari()
    val ferrariF40 = Ferrari()
    val ferrariF60 = ferrariF40
    ferrariF40.nome = ""
    ferrariF60.nome = ""



    //Equals
    if (ferrariF40 == ferrariF50){
        println("São iguais!")
    } else {
        println("São diferentes!")
    }

    //Nesse caso são iguais pois aponta pro mesmo endereço na memória
    if (ferrariF40 == ferrariF60){
        println("São iguais!")
    } else {
        println("São diferentes!")
    }

    val nome1 = "Cesar Rodrigues"
    val nome2 = "cesar rodrigues"

    //comparação de duas String é case sensitive
    if (nome1 == nome2){
        println("é igual")
    } else {
        println("são diferentes")
    }

}

class Carro {

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}