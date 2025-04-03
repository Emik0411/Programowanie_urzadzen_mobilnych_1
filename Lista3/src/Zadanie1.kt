/**
Zadanie 1.
 **/

fun findDuplicates(list: List<Int>): List<Int> {
    val widziane = mutableSetOf<Int>()   // zbiór liczb widzianych
    val powtorki = mutableSetOf<Int>()   // zbiór liczb powtórzonych

    for (numer in list) {
        if (!widziane.add(numer)) { // jeśli się nie da, to ta liczba już tam jest
            powtorki.add(numer)
        }
    }

    return powtorki.sorted()  // sortuje od najmniejszej do największej liczby
}


fun main() {
    val lst = listOf(0, 1, 1, 1, 4, 4, 4, 9, 3, 3, 3, 3, 3, 3)
    println(findDuplicates(lst))

}