/**
Zadanie 4.
 **/

fun <A> tailToHead(lst: List<A>): List<A> {
    if (lst.isEmpty()) {
        throw IllegalStateException("Empty list")
    }
    val lista = mutableListOf(lst[lst.size - 1])
    lista.addAll(lst.slice(0.. lst.size - 2))
    return lista
}

fun main() {
    print(tailToHead(listOf(1, 2, 3)))
}