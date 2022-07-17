package dio.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 4000.0, 2800.0)

    for (salario in salarios) {
    println("Salário: $salario")
    }
    println("---------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    println("---------------")

    val salarioMaiorQue2500 = salarios.filter { it > 2500.0 }
    salarioMaiorQue2500.forEach{println(it)}
    println("---------------outra forma de imprimir:")
    println("Salários acima de 2.500,00 : $salarioMaiorQue2500")
}