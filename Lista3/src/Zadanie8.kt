/**
Zadanie 8.
 **/

fun convert(slowo: String): String {
    val klawiatura = mapOf(
        'a' to "2", 'b' to "22", 'c' to "222",
        'd' to "3", 'e' to "33", 'f' to "333",
        'g' to "4", 'h' to "44", 'i' to "444",
        'j' to "5", 'k' to "55", 'l' to "555",
        'm' to "6", 'n' to "66", 'o' to "666",
        'p' to "7", 'q' to "77", 'r' to "777", 's' to "7777",
        't' to "8", 'u' to "88", 'v' to "888",
        'w' to "9", 'x' to "99", 'y' to "999", 'z' to "9999"
    ) // tworzy mapę liter i odpowiadających im liczb

    val wynik = slowo
        .lowercase() // zmienia wszystkie litery słowa na małe
        .map { klawiatura[it] ?: "" } // przechodzi przez każdą literę słowa i przypisuje jej odpowiednie liczby
       // jeśli nie ma tej litery w słowniku, to zwraca ""
        .joinToString("") // dodaje wszystkie elementy z utworzonej listy do String

    return wynik
}

fun main() {
    val word = "franek"
    println(convert(word))
}