/**
Zadanie 5.
 **/

fun <A> setHead(lst: List<A>, item: A): List<A> {
    if (!lst.isEmpty()){
        val lista = mutableListOf(item)
        lista.addAll(lst.slice(1.. lst.size - 1))
        return lista
    }
    else {
        return mutableListOf()
    }
}

fun main() {
    println(setHead(listOf(1, 2, 3), 5))
}