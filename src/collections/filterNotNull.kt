package collections

/**
 * filterNotNull - Filters out all null values from a collection.
 * It returns a new list containing only non-null elements.
 *
 * Example:
 * If you have a list with null values and you want to remove them,
 * you can use the filterNotNull function to achieve this.
 **/

fun main() {
    val numbersWithNulls = listOf(1, 2, null, 4, null, 6)

    // Using filterNotNull to remove null values
    val nonNullNumbers = numbersWithNulls.filterNotNull()

    println("Original list: $numbersWithNulls")
    println("Filtered list (without nulls): $nonNullNumbers")

    println("\n------\n")

    otherFilterNotNullExample()
}

// Additional filterNotNull example
fun otherFilterNotNullExample() {
    val namesWithNulls = listOf("Alice", null, "Bob", null, "Charlie")

    // Using filterNotNull to remove null values from a list of names
    val nonNullNames = namesWithNulls.filterNotNull()

    println("Original names: $namesWithNulls")
    println("Names without nulls: $nonNullNames")
}
