/**
Zadanie 3.
 **/

fun suma(a: List<Int>): Int {
    val wynik = a
        .filter { it > 0 } // filtruje dodatnie liczby
        .sum() // dodaje je

    return wynik
}


fun main() {
    println(suma(listOf( 1, -4, 12, 0, -3, 29, -150)))
}