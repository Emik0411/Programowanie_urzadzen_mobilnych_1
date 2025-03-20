/**
Zadanie 6.
 **/

fun check(N: Int, List: List<Int>): Int {
    for (i in List){
        if (i <= 0) {
            return i // jeśli lista zawiera niedodatnią liczbę, to ją zwraca
        }
    }
    for (i in 0 until (List.size - N)) {
        var sprawdzanie = false
        for (n in 0 until N) {
            var liczba = List[n + i]
            for (a in 0 until N) {
                //println("1. " + List[n + i] + " , 2. " + List[i + a])
                if (n + i != i + a) {
                    liczba = liczba + List[i + a]

                    if (liczba == List[i + N]) {
                        //println("Tak " + liczba + ": " + List[n + i] + " i " + List[i + a])
                        sprawdzanie = true
                    } else {
                        //println("Nie " + liczba + ": " + List[n + i] + " i " + List[i + a])
                    }
                    liczba = liczba - List[i + a]

                }

            }

        }
        if (sprawdzanie == false) {
            return List[i + N]
        }
        //println("Koniec " + i)
    }


    return (-1)
}


fun main() {
    println(check(3, listOf(1, 2, 3, 5, 7, 12, 30)))
    println(check(5, listOf(35, 25, 15, 25, 47, 40, 62, 55, 65, 95, 102, 117, 150, 182, 127, 219, 299, 277, 309, 576)))
    println(check(2, listOf(1, 2, 3, 4, 5, 6))
    )
}