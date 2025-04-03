/**
Zadanie 7.
 **/

fun srt(slowa: List<String>): List<Pair<String, List<String>>> {
    val wynik = slowa
        .filter { it.length % 2 == 0 } // filtruje słowa o parzystej długości
        .groupBy { it.first() } // grupuje słowa według pierwszej litery (klucz - pierwsza litera, wartość - słowo)
        .toSortedMap() // sortuje mapę alfabetycznie po pierwszej literze
        .map { it.key.toString() to it.value } // tworzy pary (pierwsza litera i słowo)

    return wynik
}

fun main() {
    val input = listOf(
        "cherry",
        "blueberry",
        "citrus",
        "apple",
        "apricot",
        "banana",
        "coconut"
    )
    println(srt(input))
}