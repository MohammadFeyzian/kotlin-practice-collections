package collections.list.others

/**
 * zipWithNext - Creates a list of pairs of consecutive elements from the collection.
 * This function is useful when you need to work with consecutive pairs of elements in a collection, such as for comparisons or calculations.
 **/

fun main(){
    // Example: Creating pairs of consecutive numbers
    val numbers = listOf(1, 2, 3, 4, 5)

    // Create pairs of consecutive numbers
    val consecutivePairs = numbers.zipWithNext()

    println("Original numbers: $numbers")
    println("Consecutive pairs: $consecutivePairs")

    println("\n------\n")

    anotherZipWithNextExample()
}

// Another example
fun anotherZipWithNextExample(){
    // Example: Creating pairs of consecutive words
    val words = listOf("apple", "banana", "cherry", "date")

    // Create pairs of consecutive words
    val consecutiveWordPairs = words.zipWithNext()

    println("Original words: $words")
    println("Consecutive word pairs: $consecutiveWordPairs")
}
