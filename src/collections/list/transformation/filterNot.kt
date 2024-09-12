package collections.list.transformation

/**
 * filterNot - Filters elements that do not match a given condition (predicate).
 * It returns a new list containing elements that do not satisfy the condition.
 *
 * Example:
 * If you have a list of numbers and you want to remove all even numbers,
 * you can use the filterNot function to achieve this.
 **/

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Using filterNot to exclude even numbers
    val oddNumbers = numbers.filterNot { it % 2 == 0 }

    println("Original list: $numbers")
    println("Filtered list (odd numbers): $oddNumbers")

    println("\n------\n")

    otherFilterNotExample()
}

// Additional filterNot example
fun otherFilterNotExample() {
    val names = listOf("Alice", "Bob", "Charlie", "David", "Eve")

    // Using filterNot to exclude names starting with the letter 'A'
    val namesNotStartingWithA = names.filterNot { it.startsWith("A") }

    println("Original names: $names")
    println("Names not starting with 'A': $namesNotStartingWithA")
}
