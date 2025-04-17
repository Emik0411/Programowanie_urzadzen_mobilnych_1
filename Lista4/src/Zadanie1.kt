/**
Zadanie 1.
 **/

import java.time.LocalDate
import java.time.Month
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
    val date: java.time.LocalDate,
    val amount: Int
)

object DataProvider { // object pozwala na zdefiniowanie klasy i jej instancji
    val generalCosts = List(5) {
        Cost(
            CostType.values()[kotlin.random.Random.nextInt(CostType.values().size)],
            java.time.LocalDate.of(
                2025,
                kotlin.random.Random.nextInt(1, 13),
                kotlin.random.Random.nextInt(1, 28)
            ),
            kotlin.random.Random.nextInt(5000)
        )
    }
}

fun groupedCostMap(costs: List<Cost>): Map<java.time.Month, List<Cost>> {
    return costs
        .groupBy { it.date.month } // grupuje listę po miesiącach
        .toSortedMap() // sortuje mapę po miesiącach
}

fun main() {
    println(groupedCostMap(DataProvider.generalCosts))
}

