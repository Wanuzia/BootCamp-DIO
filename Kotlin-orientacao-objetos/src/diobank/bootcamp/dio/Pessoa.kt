package diobank.bootcamp.dio

class Pessoa {
    var nome: String = "Maria"
    var cpf: String = "001.005.556-65"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val maria = Pessoa()
    println(maria.pessoaInfo())
}
