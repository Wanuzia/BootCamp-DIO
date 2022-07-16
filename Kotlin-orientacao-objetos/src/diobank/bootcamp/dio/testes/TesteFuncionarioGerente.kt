package diobank.bootcamp.dio.testes

import diobank.bootcamp.dio.Gerente

fun main() {
    val joana = Gerente(nome = "Joana", cpf = "003.056.548-45", salario = 2000.0)
    imprimiRelatorioFuncionario.imprimi(joana)
}
