/**
Zadanie 4.
 **/

fun countElements(a: List<List<String>>): Map<String, Int> {
    val wynik = a
        .flatten()  // spłaszcza listę list do jednej listy
        .map { it to 1 } // przekształcamy każdy element na parę elementu i 1
        .groupBy { it.first } // grupuje pary według elementu
        .mapValues { it.value.sumOf { para -> para.second } }
    // it.value to lista powtórzeń wytworzona w groupBy
    // sumOf dodaje wszystkie jedynki (para.second) z listy powtórzeń
    // mapValue tworzy nową listę, w której klucze się nie zmieniają

    return wynik
}

fun main() {
    println(countElements(listOf(listOf("a", "b", "c"), listOf("c", "d", "f"), listOf("d", "f", "g"))))
}