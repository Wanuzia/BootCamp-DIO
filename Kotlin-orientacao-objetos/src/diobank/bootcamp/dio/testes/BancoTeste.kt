package diobank.bootcamp.dio.testes

import diobank.bootcamp.dio.Banco

fun main() {
    val dioBank = Banco(nome = "Dio", numero = 12)

    println(dioBank.nome)
    println(dioBank.numero)

    val banco2 = dioBank.copy(nome = "wanuBank")
    println(banco2.info())
}

