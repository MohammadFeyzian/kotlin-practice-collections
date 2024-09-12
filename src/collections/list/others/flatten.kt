package collections.list.others

/**
 * flatten - Flattens a collection of collections into a single collection.
 * This function is useful when you have nested collections (such as a list of lists) and want to combine them into a single collection.
 **/

fun main(){
    // Example: Flattening a list of lists of numbers
    val nestedNumbers = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )

    // Flatten the list of lists into a single list
    val flattenedNumbers = nestedNumbers.flatten()

    println("Original nested numbers: $nestedNumbers")
    println("Flattened list: $flattenedNumbers")

    println("\n------\n")

    anotherFlattenExample()
}

// Another example
fun anotherFlattenExample(){
    // Example: Flattening a list of lists of strings
    val nestedWords = listOf(
        listOf("apple", "banana"),
        listOf("cherry", "date"),
        listOf("elderberry", "fig")
    )

    // Flatten the list of lists into a single list
    val flattenedWords = nestedWords.flatten()

    println("Original nested words: $nestedWords")
    println("Flattened list: $flattenedWords")
}
