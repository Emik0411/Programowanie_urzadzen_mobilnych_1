/**
Zadanie 5.
 **/

fun checkArmstrong(liczba: Int): Boolean {
    val ilosc = liczba.toString().length

    var aktualna = liczba
    var suma = 0
    for (i in 1..ilosc) {

        var cyfra = aktualna % 10

        aktualna = (aktualna - cyfra) / 10

        var poczekalnia = 1

        for (n in 1..ilosc) {
            poczekalnia = poczekalnia * cyfra
        }
        suma = suma + poczekalnia


    }
    if (suma == liczba) {
        return true
    }
    else {
        return false
    }
}


fun main() {
    val number: Int = 153
    println(checkArmstrong(number))
}
