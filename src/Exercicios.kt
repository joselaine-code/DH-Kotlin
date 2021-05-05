fun main() {
//    qualOMaior(10,20,3)
//    parOuImpar(50)
//    imprimirImpares()
//    println(analise(7,10,5,6))
    println(exercicio3(4))
    exercicio4()

}
//1)
fun qualOMaior(a:Int, b:Int, c:Int){
   if (a > b && a > c){
       println("O número maior é $a")
   } else if (b > c && b > a ){
       println("O número maior é $b")
   } else {
       println("O número maior é $c")
   }
}

//2)
fun textoIguais(texto1:String, texto2:String): Boolean{
    return texto1 == texto2
}

//3)
fun parOuImpar(n:Int){
    if (n%2 == 0) println("Esse número é par") else println("Esse número é Impar")
}

//3) CORREÇÃO PROFESSOR
fun exercicio3(numero:Int): Boolean{
    return (numero%2 == 0)
}

//4)
fun imprimirImpares(){
    for (n in 1..100) if (n%2 != 0){ println(n) }
}
//4) CORREÇÃO PROFESSOR
fun exercicio4(){
    var cont=0
    var numero = 1
    while (cont < 100){
        if (numero%2 != 0){
            println(numero)
            cont++
        }
        numero++
    }
}

//5)

fun analise(numA:Int, numB:Int, numC:Int, numD:Int): Boolean {
    return (numA > numC) && (numA > numD) || (numB > numC) && (numB > numD)
}

//6)
fun imprimir100(){
    for (n in 1..100) { println(n) }
}