fun main() {
    //Aula sobre herança no Kotlin

    val neguinha = Cachorro()

    neguinha.come()
    println(neguinha.sexo)

}

class Cachorro : Animal("F") {

    override fun come() {
        println("Comendo auau")

    }


}

open class Animal(
    open var sexo: String
) {

    open fun come() {
        println("Come de jeito default")
    }
}