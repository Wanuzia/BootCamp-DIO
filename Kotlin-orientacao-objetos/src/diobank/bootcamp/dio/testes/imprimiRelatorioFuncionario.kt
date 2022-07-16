package diobank.bootcamp.dio.testes
import diobank.bootcamp.dio.Funcionario

class imprimiRelatorioFuncionario {
    companion object {
        fun imprimi (funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}