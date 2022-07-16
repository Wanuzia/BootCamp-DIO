package diobank.bootcamp.dio.testes

import diobank.bootcamp.dio.Funcionario
import diobank.bootcamp.dio.Pessoa
import java.math.BigDecimal

fun main() {
    val maria = Pessoa(nome = "Maria", cpf = "005.056.548-45")
    println(maria.nome)
    println(maria.cpf)
    val joao = Funcionario(nome = "Joao", cpf = "002.056.548-45", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}
