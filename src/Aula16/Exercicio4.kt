package Aula16

class Peca(
    val marca: String,
    val modelo: String
) {
    override fun toString(): String {
        return "Marca: $marca Modelo: $modelo"
    }
}

class GuardaVolumes() {
    val map = mutableMapOf<Int, List<Peca>>()
    var cont = 1

    fun guardarPecas(list: List<Peca>) {
        map[cont] = list
        println("Seu número é $cont")
        cont++
    }

    fun mostrarPecas() {
        map.forEach { t, u -> println("$t -> ${u.toString()}") }
    }

    fun mostrarPeca(int: Int) {
        if (map.containsKey(int)) {
            println(map.getValue(int))
        } else {
            println("Não encontrado")
        }
    }

    fun devolverPecas(int: Int) {
        if (map.containsKey(int)) {
            map.remove(int)
            println("Devolvido com sucesso")
        } else {
            println("Não encontrado")
        }
    }
}

fun main() {
    val guardaVolumes = GuardaVolumes()
    val peca1 = Peca("Crystal","Água Mineral")
    val peca2 = Peca("Logi","Mouse Sem Fio")
    val peca3 = Peca("Dell","Notebook AOF355")

    guardaVolumes.guardarPecas(listOf(peca1))
    guardaVolumes.guardarPecas(listOf(peca2, peca3))

    guardaVolumes.mostrarPecas()

    guardaVolumes.devolverPecas(1)
    guardaVolumes.devolverPecas(2)
}