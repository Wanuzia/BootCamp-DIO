package dio.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Maria", 2500.0)
    val map1 = mapOf(pair)

    map1.forEach { (x, y) -> println("Chave: $x - Valor: $y") }

    println("-----")
    val map2 = mapOf(
        "Dandara" to 5000.0,
        "Joana" to 3500.0
    )
    map2.forEach { (x, y) -> println("Chave: $x - Valor: $y") }
}