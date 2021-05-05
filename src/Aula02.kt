fun main() {
    meuNomeCompleto("Ana","Rodrigues")

    println(someDoisNumero(3.65,1.0))
}

fun meuNomeCompleto(nome:String, sobrenome:String){
    println("Meu nome é $nome $sobrenome")
}

fun someDoisNumero(a : Double, b: Double) : Double{
    return a + b
}