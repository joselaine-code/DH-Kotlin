package ExtraClasse

fun main() {
    exercicio9()
}

fun exercicio1(){
    println("Olá, mundo!")
}
fun exercicio2(){
    print("Qual o seu nome?" )
    val nome = readLine().toString()
    println("Olá $nome, é um prazer te conhecer!")
}
fun exercicio3(){
    print("Digite o nome do funcionário: ")
    val nome = readLine()
    print("Digite o salário do funcionário: ")
    val salario = readLine()?.toDouble()
    println("O funcionário $nome tem um salário de R$ $salario")

}
fun exercicio4(){
    print("Digite o primeiro número: ")
    val n1 = readLine()?.toInt()
    print("Digite o segundo número: ")
    val n2 = readLine()?.toInt()
    println("A soma entre $n1 e $n2 é ${n1!! + n2!!}")
}
fun exercicio5(){
    print("Digite a primeira nota: ")
    val n1 = readLine()?.toDouble()
    print("Digite a segunda nota: ")
    val n2 = readLine()?.toDouble()
    println("A média entre $n1 e $n2 é ${(n1!! + n2!!)/2}")
}
fun exercicio6(){
    print("Digite um número: ")
    val n1 = readLine()?.toInt()
    println("O antecessor de $n1 é ${n1!! - 1}")
    println("O sucessor de $n1 é ${n1!! + 1}")
}
fun exercicio7(){
    print("Digite um número: ")
    val n = readLine()?.toDouble()
    println("O dobro de $n é ${n!! * 2}")
    println("A terça parte de $n é ${n!! / 3}")
}
fun exercicio8(){
    print("Digite uma distância em metros: ")
    val metros = readLine()?.toDouble()
    println("A distancia de $metros metros equivale a:")
    println("${metros!!/1000} km")
    println("${metros!!/100} hm")
    println("${metros!!/10} dam")
    println("${metros!! * 10} dm")
    println("${metros!! * 100} cm")
    println("${metros!! * 1000} mm")
}
fun exercicio9(){
    print("Quanto você tem em R$? ")
    val reais = readLine()?.toDouble()
    println("Você pode comprar U$$ ${reais!!/3.45}")
}


