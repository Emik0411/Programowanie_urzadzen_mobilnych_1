/**
Zadanie 5.
 **/

fun evenPositiveSquare(a: List<Int>): List<Int> {
    val wynik = a
        .filterIndexed { index, it -> index % 2 == 1 } // filtruje liczby po nieparzystych indeksach
        .filter { it > 0 } // filtruje tylko dodatnie liczby
        .map { it * it } // podnosimy wybrane liczby do kwadratu

    return wynik
}

fun main() {
    println(evenPositiveSquare(listOf(1, 2, 3, 5, -6, -1, -1, 2, 3)))

}