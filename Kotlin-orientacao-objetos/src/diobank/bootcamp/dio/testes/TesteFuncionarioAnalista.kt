package diobank.bootcamp.dio.testes

import diobank.bootcamp.dio.Analista

fun main() {
    val joao = Analista(nome = "Joao", cpf = "002.056.548-45", salario = 2000.0)
    imprimiRelatorioFuncionario.imprimi(joao)
}
