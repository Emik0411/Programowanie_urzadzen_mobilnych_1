/**
Zadanie 3.
 **/

fun printPascal(wysokosc: Int) {
    if (wysokosc > 0) {
        val liczba = 2 * wysokosc - 1
        var biezaca = mutableListOf(1)
        var wczesniejsza = mutableListOf(1)

        for (i in 1..wysokosc) {
            val miejsce = 2 * i - 1
            val spacje = (liczba - miejsce) / 2

            var linia = " ".repeat(spacje)

            biezaca.clear()
            for (n in 1..i) {
                if (n == 1 || n == i) {
                    biezaca.add(1)
                } else {

                    biezaca.add(wczesniejsza[n - 2] + wczesniejsza[n - 1])

                }
                linia = linia + biezaca[n - 1] + " "

            }

            wczesniejsza.clear()
            wczesniejsza.addAll(biezaca)

            println(linia)

        }
    }
    else {
        println("Za mała wysokość")
    }

}

fun main() {
    val height: Int = 4
    printPascal(height)
}
