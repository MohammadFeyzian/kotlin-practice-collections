package collections.list.transformation

/**
 * map - Transforms each element of the collection by applying the given function to it.
 * It creates a new list where every element from the original collection is transformed.
 *
 * Example:
 * If you have a list of integers and you want to square each element,
 * you can use the map function to achieve this.
 **/

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // Using map to square each number in the list
    val squareNumber = numbers.map { it * it }

    println("Original list: $numbers")
    println("Square list: $squareNumber")

    otherTransformations()
}

// If needed, you can add more transformation examples:
fun otherTransformations() {
    val names = listOf("Alice", "Bob", "Charlie")

    // Using map to convert all names to uppercase
    val upperCaseNames = names.map { it.uppercase() }

    println("Original names: $names")
    println("Uppercase names: $upperCaseNames")
}
