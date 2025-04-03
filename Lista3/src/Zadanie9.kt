/**
Zadanie 9.
 **/

data class StudentScore(val name: String, val subject: String, val score: Int)

fun analyzeResults(students: List<StudentScore>): Triple<Map<String, List<StudentScore>>, List<StudentScore>, List<String>> {
    // mapa studentów, którzy zdali
    val passedBySubject = students
        .filter { it.score >= 50 } // filtrujemy studentów, którzy zdali
        .groupBy { it.subject } // grupuje tych studentów według przedmiotu

    // lista studentów, którzy nie zdali
    val failed = students
        .filter { it.score < 50 } // filtrujemy studentów, którzy nie zdali

    // lista przedmiotów, w których wszyscy studenci zdali
    val subjectsAllPassed = passedBySubject.filter { (_, scores) -> // filtrujemy mapę, by znaleźć
        // przedmioty, w których wszyscy zdali
        scores.size == students.filter { it.subject == scores.first().subject }.size // sprawdzamy czy liczba
    // zdanych studentów jest równa liczbie zapisanych na ten
    // przedmiot studentów
            }.keys.toList() // przekształca klucze mapy w listę (przedmioty = klucze)

    return Triple(passedBySubject, failed, subjectsAllPassed)
}

fun main() {
    val students = listOf(
        StudentScore("Alice", "Math", 78),
        StudentScore("Bob", "Math", 45),
        StudentScore("Charlie", "Physics", 92),
        StudentScore("Dave", "Physics", 55),
        StudentScore("Eve", "Physics", 40),
        StudentScore("Frank", "CS", 60),
        StudentScore("Grace", "CS", 80),
    )

    // Przeprowadzamy analizę wyników
    val (passedBySubject, failed, subjectsAllPassed) = analyzeResults(students)

    // Wypisujemy wyniki
    println("Zdani studenci według przedmiotów: $passedBySubject")
    println("Niezdani studenci: $failed")
    println("Przedmioty, w których wszyscy zdali: $subjectsAllPassed")
}