/**
Zadanie 2.
 **/

fun isPalindrome(slowo: String): Boolean {
    if (slowo != "") {
        val ilosc = slowo.length
        val nowe_slowo = slowo.uppercase()

        for (i in 0..ilosc / 2 - 1) {
            if (nowe_slowo[i] != nowe_slowo[ilosc - i - 1]) {
                return false
            }
        }
        return true
    }
    else {
        return false
    }
}

fun main() {
    val word = "abba"

    println(isPalindrome(word))
}