package dio.collections

fun main() {
    val maria = Funcionario(nome = "Maria", salario = 2800.0)
    val dandara = Funcionario(nome = "Dandara", salario = 5000.0)
    val alice = Funcionario(nome = "Alice", salario = 1500.0)

    val funcionarios = listOf(maria, dandara, alice)

    funcionarios.forEach{ println(it) }

    println("---------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("---------------a seguir, exemplo de encadeamento:")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }
}
data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
        Nome: $nome
        Salário: $salario
        """.trimIndent()
    }

