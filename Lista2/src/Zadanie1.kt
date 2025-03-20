/**
    Zadanie 1.
 **/

fun main() {
    val r: (String, Int) -> String = {s: String, i: Int -> s.repeat(i)}
    println(r("a", 3))
}