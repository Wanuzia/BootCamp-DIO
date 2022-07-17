package dio.collections

fun main() {
    val maria = Funcionario(nome = "Maria", salario = 2800.0, tipoContrato = "CLT")
    val dandara = Funcionario(nome = "Dandara", salario = 5000.0, tipoContrato = "PJ")
    val alice = Funcionario(nome = "Alice", salario = 1500.0, tipoContrato = "CLT")

    val funcionarios = listOf(maria, dandara, alice)

    funcionarios.forEach{ println(it) }

    println("---------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("---------------a seguir, exemplo de encadeamento:")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("---------------")
    funcionarios
        .groupBy { it.tipoContrato }
        .forEach { println(it) }

}


