package dio.collections

fun main() {
    val maria = Funcionario(nome = "Maria", salario = 2800.0, tipoContrato = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 5000.0, tipoContrato = "PJ")
    val alice = Funcionario(nome = "Alice", salario = 1500.0, tipoContrato = "CLT")

    val funcionarios = mutableListOf(maria, alice)
    funcionarios.forEach { println(it) }

    println("-------List---------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("----------------")
    funcionarios.remove(maria)
    funcionarios.forEach { println(it) }

    println("---------Set-------")
    val funcionariosSet = mutableSetOf(maria)
    funcionariosSet.add(pedro)
    funcionariosSet.add(alice)
    funcionariosSet.forEach { println(it) }
}