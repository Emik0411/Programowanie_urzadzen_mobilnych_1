/**
Zadanie 4.
 **/

import java.time.LocalDate
import kotlin.random.Random

enum class CostType(val costType: String) {
    REFUELING("Tankowanie"),
    SERVICE("Serwis"),
    PARKING("Parking"),
    INSURANCE("Ubezpieczenie"),
    TICKET("Mandat")
}

data class Cost(
    val type: CostType,
    val date: LocalDate,
    val amount: Int
)

data class Car(
    val name: String,
    val brand: String,
    val model: String,
    val yearOfProduction: Int,
    val costs: List<Cost>
)

object DataProvider {
    private fun generalCosts(size: Int) = List(size) {
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

    val cars = listOf(
        Car("Domowy", "Skoda", "Fabia", 2002, generalCosts(100)),
        Car("Służbowy", "BMW", "Coupe", 2015, generalCosts(50)),
        Car("Kolekcjonerski", "Fiat", "125p", 1985, generalCosts(10))
    )
}

fun getFullCosts(cars: List<Car>): Map<CostType, Int> {
    return CostType.values().associateWith { type -> // bierze listę wszystkich kosztów i tworzy mapę
        // kluczem jest typ
        //wartością jest:
        cars.flatMap { it.costs } // bierzemy auta i łączymy kwoty w jedną listę
            .filter { it.type == type } // filtruje tylko koszty dla konkretnego typu
            .sumOf { it.amount } // i sumuje te kwoty
    }
}

fun printFullCost(costMap: Map<CostType, Int>) {
    costMap.forEach { (type, total) -> // przechodzi przez całą mapę i
        println("${type.name} $total") // wypisuje typ i kwotę
    }
}

fun main() {
    printFullCost(getFullCosts(DataProvider.cars))
}
