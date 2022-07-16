package diobank.bootcamp.dio.testes

import diobank.bootcamp.dio.Pessoa

fun main() {
    val maria = Pessoa(nome = "Maria", cpf = "005.056.548.45")
    println(maria.nome)
    println(maria.cpf)
}