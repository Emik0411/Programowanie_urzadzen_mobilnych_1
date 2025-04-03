/**
Zadanie 6.
 **/

fun perm(list: List<Int>): List<List<Int>> {
    if (list.isEmpty()) {
        return listOf(emptyList()) // zwraca listę pustej listy
    }
    return list
            .map { element ->                       // dla każdego elemnetu listy
                perm(list.filter { it != element }) // wywołuje funkcję perm, ale listy bez używanego obecnie elemntu
                    .map { listOf(element) + it }   // łączy używany elemnt z listą użytą w perm
            }.flatten()                             // spłaszcza map na listę list


}

fun main() {
    println(perm(listOf(1, 2, 3)))
}