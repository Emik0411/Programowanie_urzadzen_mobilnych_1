/**
Zadanie 10.
 **/

data class Point(val x: Int, val y: Int) {
    operator fun plus(drugi: Point) = Point(x + drugi.x, y + drugi.y) // dodawanie dwóch Pointów
    operator fun plus(wartosc: Int) = Point(x + wartosc, y + wartosc) // dodawanie Pointa i liczby
    operator fun minus(drugi: Point) = Point(x - drugi.x, y - drugi.y) // odejmowanie dwóch Pointów
    operator fun times(drugi: Point) = Point(x * drugi.x, y * drugi.y) // mnożenie dwóch Pointów
    operator fun inc() = Point(x + 1, y + 1) // zwiększanie o 1
    operator fun dec() = Point(x - 1, y - 1) // zmiejszanie o 1
    operator fun not() = Point(-x, -y) // odwracanie znaku
}

fun main() {
    var p1 = Point(1, 1)
    val p2 = Point(2, 2)

    val a = p1 + p2
    println(a)

    val b = p1 + 1
    println(b)

    val c = p1 - p2
    println(c)

    val d = p1 * p2
    println(d)

    p1++
    println(p1)

    p1 = Point(1, 1)

    p1--
    println(p1)

    p1 = Point(1, 1)

    val g = !p1
    println(g)
}