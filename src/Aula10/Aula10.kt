abstract class Automovel() {
    //Classe Abstratas não podem ser instanciadas
    abstract fun acelerar()
    abstract fun freiar()
}

class Ferrari : Automovel() {
    var nome = ""
    override fun acelerar() {
        TODO("Not yet implemented")
    }

    override fun freiar() {
        TODO("Not yet implemented")
    }

    override fun equals(other: Any?): Boolean {
        val outraFerrari = other as? Ferrari
        return when (other) {
            is Ferrari -> {
                this.nome == outraFerrari?.nome
            }
            else -> {
                super.equals(other)
            }
        }
    }
}




















































