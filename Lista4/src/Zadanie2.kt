/**
Zadanie 2.
 **/

import java.time.LocalDate
import kotlin.random.Random

enum class CostType(val costType: String) { // enum class - klasa do definiowania zbioru stałych
    REFUELING("Tankowanie"),
    SERVICE("Serwis"),
    PARKING("Parking"),
    INSURANCE("Ubezpieczenie"),
    TICKET("Mandat")
}

data class Cost( // data class - dzięki temu można porównywać obiekty (== - porównanie wartości / === - porównanie referencji)
    val type: CostType,
    val date: LocalDate,
    val amount: Int
)

object DataProvider { // object pozwala na zdefiniowanie klasy i jej instancji
    val generalCosts = List(10) {
        Cost(
            CostType.values()[Random.nextInt(CostType.values().size)],
            LocalDate.of(
                2025,
                Random.nextInt(1, 13),
                Random.nextInt(1, 28)
            ),
            Random.nextInt(5000)
        )
    }
}

fun printGroupedCosts(costs: List<Cost>) {
    costs
        .groupBy { it.date.month } // grupuje listę po miesiącach
        .toSortedMap() // sortuje mapę po miesiącach
        .forEach { (month, monthCosts) -> // dla każdego miesiąca
            println(month.name) // wypisuje miesiąc
            monthCosts.sortedBy { it.date.dayOfMonth } // sortuje ceny po dniach
                .forEach { cost ->
                    println("${cost.date.dayOfMonth.toString().padStart(2, '0')} ${cost.type.name} ${cost.amount} zł")
                } // wypisujemy dzień (2 cyfry) i koszt
        }
}

fun main() {
    printGroupedCosts(DataProvider.generalCosts)
}
