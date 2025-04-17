/**
Zadanie 3.
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

fun getCarCosts(carName: String): List<Pair<CostType, Int>> {
    val car = DataProvider.cars.find { it.name == carName } // szuka auta z taką samą nazwą
    return CostType.values()
        .map { type -> // dla wszystkich możliwych typów kosztów
            type to (car?.costs?.filter { it.type == type }?.sumOf { it.amount } ?: 0)
        } // jeśli auto istnieje bierze listę kosztów
        // filtruje koszty by pasowały do typu na który teraz patrzymy
        // i sumuje je
        .sortedByDescending { it.second } // sortuje malejąco
}

fun printCarCosts(costList: List<Pair<CostType, Int>>) {
    costList.forEach { (type, total) -> // dla każdej pary
        println("${type.name} ${total} zł") // wyświetla nazwę i sumę
    }
}

fun main() {
    printCarCosts(getCarCosts("Domowy"))
}
