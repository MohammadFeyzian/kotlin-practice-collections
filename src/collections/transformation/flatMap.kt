package collections.transformation

/**
 * flatMap - Applies a transformation function to each element of the collection,
 * and then flattens the resulting collections into a single list.
 * It is useful when you need to transform and flatten a collection of collections.
 *
 * Example:
 * If you have a list of lists and you want to transform each inner list and combine them into a single list,
 * you can use flatMap to achieve this.
 **/

fun main() {
    val nestedLists = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )

    // Using flatMap to flatten and multiply each element by 2
    val flattenedAndTransformed = nestedLists.flatMap { innerList ->
        innerList.map { it * 2 }
    }

    println("Original nested lists: $nestedLists")
    println("Flattened and transformed list: $flattenedAndTransformed")

    println("\n------\n")

    otherFlatMapExample()
}

// Additional flatMap example
fun otherFlatMapExample() {
    val words = listOf("hello", "world")

    val ch = words.flatMap { it.toList() }

    // Using flatMap to split each word into characters and flatten the result
    val characters = words.flatMap { it.toList() }

    println("Original words: $words")
    println("Flattened characters: $characters")
}
