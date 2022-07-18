package dio.collections

fun main() {
    val maria = Funcionario(nome = "Maria", salario = 2800.0, tipoContrato = "CLT")
    val dandara = Funcionario(nome = "Dandara", salario = 5000.0, tipoContrato = "PJ")
    val alice = Funcionario(nome = "Alice", salario = 1500.0, tipoContrato = "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(maria.nome, maria)
    repositorio.create(dandara.nome, dandara)
    repositorio.create(alice.nome, alice)

    println("--------add-Maria------")
    println(repositorio.findById(maria.nome))

    println("--------print-all-collection------")
    repositorio.findAll().forEach { println(it) }

    println("--------remove-alice-------")
    repositorio.remove(alice.nome)
    repositorio.findAll().forEach { println(it) }

}