package collections.list.transformation

/**
 * filter - Filters elements of the collection based on a given condition (predicate).
 * It returns a new list containing only the elements that match the condition.
 *
 * Example:
 * If you have a list of numbers and you want to keep only the even ones,
 * you can use the filter function to achieve this.
 **/

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Using filter to keep only even numbers
    val evenNumbers = numbers.filter { it % 2 == 0 }

    println("Original list: $numbers")
    println("Filtered list (even numbers): $evenNumbers")

    println("\n------\n")

    otherFilterExample()
}

// Additional filter example
fun otherFilterExample() {
    val names = listOf("Alice", "Bob", "Charlie", "David", "Eve")

    // Using filter to keep names starting with the letter 'A'
    val namesStartingWithA = names.filter { it.startsWith("A") }

    println("Original names: $names")
    println("Names starting with 'A': $namesStartingWithA")
}
