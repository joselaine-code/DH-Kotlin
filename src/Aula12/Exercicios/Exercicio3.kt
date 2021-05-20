package Aula12.Exercicios

class Student(
    val name: String,
    val studentNumber: Int
){
    override fun equals(other: Any?): Boolean {
        val otherStudent = other as? Student
        return otherStudent?.studentNumber == this.studentNumber
    }

}

fun main() {
    val student = Student("Pedro Andre", 123456)
    val student1 = Student("Pedro Andre", 123456)

    if (student == student1){
        println("São Iguais")
    } else {
        println("São diferentes")
    }
}