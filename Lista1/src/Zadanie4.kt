/**
Zadanie 4.
 **/

fun isPerfect(liczba: Int): String {
    var Suma = 0;
    for (i in 1..liczba - 1) {
        if (liczba % i == 0) {
            Suma = Suma + i
        }
    }

    if (Suma > liczba) {
        return "obfita"
    }
    else if (Suma == liczba) {
        return "doskonała"
    }
    else {
        return "niedomiarowa"
    }
}

fun main() {
    val number: Int = 28
    println(isPerfect(number))
}
