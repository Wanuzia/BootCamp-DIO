package diobank.bootcamp.dio.testes

import diobank.bootcamp.dio.Cliente
import diobank.bootcamp.dio.ClienteTipo

fun main(){
    val carla = Cliente(
        nome = "Carla Maria",
        cpf = "569.896.587-78",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(carla)

    TesteAutenticacao().autentica(carla)
}
