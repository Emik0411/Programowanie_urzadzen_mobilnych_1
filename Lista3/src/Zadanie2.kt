/**
Zadanie 2.
 **/

fun addToBoolena(): Map<Int, Boolean> {
    val mapa = mutableMapOf<Int, Boolean>()  // tworzymy mapę

    for (i in 1..20) {
        mapa[i] = i % 2 == 0  // jeżeli liczba jest parzysta - true, nieparzysta - false
    }

    return mapa
}

fun main() {
println(addToBoolena())
}