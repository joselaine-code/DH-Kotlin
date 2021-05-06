class Aula02 {
    //Uma classe possui atributos e métodos

}

class Animal (
    //construtor primário
    val nome: String,
    val peso: Int,
) {
    //construtor secundário
    constructor(peso:Int, nome:String, reino: String) : this(nome, peso)

    private val teste1 = "Execução1"

    //primeiro a ser chamado
    init {

    }

    fun comer() {
        println("Estou me alimentando")
    }

    override fun toString(): String {
        return "Nome: $nome\nPeso: $peso kg"
    }
}