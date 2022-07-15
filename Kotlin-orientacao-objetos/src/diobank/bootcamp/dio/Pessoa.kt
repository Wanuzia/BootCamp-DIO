package diobank.bootcamp.dio

class Pessoa {
    var nome: String = "Maria"
    var cpf: String = "001.005.556-65"
    private set
}

fun main() {
    val maria = Pessoa()
    println(maria.nome)
    println(maria.cpf)
}
