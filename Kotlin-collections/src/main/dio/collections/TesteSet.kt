package dio.collections

fun main() {
    val maria = Funcionario(nome = "Maria", salario = 2800.0, tipoContrato = "CLT")
    val dandara = Funcionario(nome = "Dandara", salario = 5000.0, tipoContrato = "PJ")
    val alice = Funcionario(nome = "Alice", salario = 1500.0, tipoContrato = "CLT")

    val funcionarios1 = setOf(maria, alice)
    val funcionarios2 = setOf(dandara)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("-------------------")

    val funcionarios3 = setOf(maria, alice, dandara)
    val resultSubstract = funcionarios3.subtract(funcionarios2)
    resultSubstract.forEach { println(it) }

    println("-------------------")

    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}
