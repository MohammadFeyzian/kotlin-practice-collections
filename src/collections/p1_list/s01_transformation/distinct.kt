package collections.p1_list.s01_transformation

/**
 * distinct - Removes duplicate elements from the collection.
 * also: distinctBy{ }
 * It returns a new list containing only distinct elements, preserving the order of the first occurrence.
 *
 * Example:
 * If you have a list with duplicate values and you want to keep only unique elements,
 * you can use the distinct function to achieve this.
 **/

fun main() {
    val numbersWithDuplicates = listOf(1, 2, 2, 3, 4, 4, 5, 6, 6, 7)

    // Using distinct to remove duplicates
    val uniqueNumbers = numbersWithDuplicates.distinct()

    println("Original list: $numbersWithDuplicates")
    println("List with distinct elements: $uniqueNumbers")

    println("\n------\n")

    otherDistinctExample()
}

// Additional distinct example
fun otherDistinctExample() {
    val namesWithDuplicates = listOf("Alice", "Bob", "Alice", "Charlie", "Bob", "David")

    // Using distinct to remove duplicate names
    val uniqueNames = namesWithDuplicates.distinct()
    namesWithDuplicates.distinctBy{ it.length }

    println("Original names: $namesWithDuplicates")
    println("Names with distinct elements: $uniqueNames")
}
