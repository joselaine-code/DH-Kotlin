package Aula11.Exercicio

class Impressora {

    val list = mutableListOf<Imprimivel>()

    fun adiciona(item : Imprimivel){
        list.add(item)
    }

    fun imprimir(){
        for (t in list){
            t.imprimir()
        }

        /*
        or
        list.forEach { it.imprimir() }
         */
    }
}

fun main() {
    var doc = Documento()
    var foto = Foto()
    var contrato = Contrato()
    var impressora = Impressora()

    impressora.adiciona(doc)
    impressora.adiciona(foto)
    impressora.adiciona(contrato)

    impressora.imprimir()
}