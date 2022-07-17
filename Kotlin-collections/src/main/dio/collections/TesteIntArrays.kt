package dio.collections

fun main() {
    val values = IntArray(5)
        values[0] = 3
        values[1] = 18
        values[2] = 5
        values[3] = 7
        values[4] = 10

    for(valor in values) {
        println(valor)
    }
    println("-------------")
    values.forEach {
        println(it)
    }
    println("-------------")
    for (index in values.indices){
        println(values[index])
    }
    println("-------------")
    values.sort()
    for(valor in values) {
        println(valor)
    }
}
