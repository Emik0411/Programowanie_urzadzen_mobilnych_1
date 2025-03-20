/**
    Zadanie 2.
 **/


val <T> List<T>.tail: List<T>
    get() =  this.drop(1)

val <T> List<T>.head: T
    get() = this.first()

fun main() {
    val lista = listOf(1, 2, 3, 4, 5);
    println("Head: " +  lista.head)
    println("Tail: " + lista.tail)

}
