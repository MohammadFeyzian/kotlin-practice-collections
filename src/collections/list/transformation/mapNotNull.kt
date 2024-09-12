package collections.list.transformation

/**
 * mapNotNull - Transforms each non-null element of the collection by applying the given function to it,
 * while removing any null values from the collection.
 * It returns a new list with transformed non-null elements.
 *
 * Example:
 * If you have a list with null values and you want to both remove nulls
 * and apply a transformation to the non-null elements, you can use mapNotNull.
 **/

fun main() {
    val numbersWithNulls = listOf(1, 2, null, 4, null, 6)

    // Using mapNotNull to remove nulls and square non-null values
    val squaredNonNullNumbers = numbersWithNulls.mapNotNull { it?.let { it * it } }

    println("Original list: $numbersWithNulls")
    println("Transformed list (squared non-null numbers): $squaredNonNullNumbers")

    println("\n------\n")

    otherMapNotNullExample()
}

// Additional mapNotNull example
fun otherMapNotNullExample() {
    val namesWithNulls = listOf("Alice", null, "Bob", null, "Charlie")

    // Using mapNotNull to remove null values and convert non-null names to uppercase
    val upperCaseNonNullNames = namesWithNulls.mapNotNull { it?.uppercase() }

    println("Original names: $namesWithNulls")
    println("Transformed names (uppercase non-null): $upperCaseNonNullNames")
}
