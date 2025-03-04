/**
Zadanie 1.
 **/
fun foo(number: Int) {
    for (i in 1..number) {
        var wyswietlna: String = "";
        // a)
        if (i % 3 == 0) {
            wyswietlna = wyswietlna + "trzy"
        }

        if (i % 5 == 0) {
            wyswietlna = wyswietlna + "piec"
        }

        // b)
        if (i % 7 == 0) {
            wyswietlna = wyswietlna + "siedem"
        }

        // c)
        if (i % 11 == 0) {
            wyswietlna = wyswietlna + "jedenascie"
        }

        if (i % 13 == 0) {
            wyswietlna = wyswietlna + "trzynascie"
        }

        if (wyswietlna == "") {
            wyswietlna = i.toString()
        }

        println(wyswietlna)
    }

}

fun main() {
    val num: Int = 33

    foo(num)
}
