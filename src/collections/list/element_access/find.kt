package collections.list.element_access

/**
 * find - Finds the first element in the collection that matches the given condition (predicate).
 * It returns the element if found, otherwise `null`.
 * This function is useful for locating the first match in a collection based on a condition.
 **/

fun main(){
    // Example: Find the first even number in the list
    val numbers = listOf(1, 2, 3, 4, 5)

    numbers.find { it % 2 == 0 }

    // Find the first even number
    val firstEvenNumber = numbers.find { it % 2 == 0 }

    // Find the last even number
    val lastEvenNumber = numbers.findLast { it % 2 == 0 }

    println("Original numbers: $numbers")
    println("First even number: $firstEvenNumber")

    println("\n------\n")

    anotherFindExample()
}

// Another example
fun anotherFindExample(){
    // Example: Find the first word that starts with "A"
    val words = listOf("Kotlin", "Android", "Development", "AI")

    // Find the first word that starts with "A"
    val firstWordStartingWithA = words.find { it.startsWith("A") }

    // Find the first word that starts with "A"
    val lastWordStartingWithA = words.findLast { it.startsWith("A") }

    println("Original words: $words")
    println("First word starting with 'A': $firstWordStartingWithA")
}
