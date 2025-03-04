/**
Zadanie 2.
 **/

fun isPalindrome(slowo: String): Boolean {
    val ilosc = slowo.length

    for (i in 0..ilosc / 2 - 1) {
        if (slowo[i] != slowo[ilosc - i - 1]) {
            return false
        }
    }
    return true

}

fun main() {
    val word = "abba"

    println(isPalindrome(word))
}