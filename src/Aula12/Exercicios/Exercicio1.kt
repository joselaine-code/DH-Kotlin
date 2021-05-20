package Aula12.Exercicios

class Person(
    val name: String,
    val rg: Int
) {
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? Person
        return when (other) {
            is Person -> {
                this.rg == otherPerson?.rg
            }
            else -> {
                super.equals(other)
            }
        }
    }
}

fun main() {
    val person1 = Person("Ana Leticia", 123456)
    val person2 = Person("Ana Leticia", 123456)

    if (person1 == person2) {
        println("São iguais")
    } else {
        println("Não são iguais")
    }
}