package Aula10.Exercicio

class Normal(valor: Double = 15.0) : Ingreso(valor) {
    override fun imprimeValor() {
        println("Ingresso Normal")
    }
}