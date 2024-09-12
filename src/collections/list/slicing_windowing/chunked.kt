package collections.list.slicing_windowing

/**
 * chunked - Splits a collection into fixed-size chunks and returns a list of lists.
 * Each chunk contains up to the specified number of elements, and the last chunk may be smaller if there are not enough elements.
 * This function is useful for processing elements in batches or groups.
 **/

fun main(){
    // Example: Splitting a list of numbers into chunks of size 2
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    // Split the list into chunks of 2 elements
    val chunkedNumbers = numbers.chunked(2)

    println("Original numbers: $numbers")
    println("Chunked into size 2: $chunkedNumbers")

    println("\n------\n")

    anotherChunkedExample()
}

// Another example
fun anotherChunkedExample(){
    // Example: Splitting a list of strings into chunks of size 3
    val words = listOf("apple", "banana", "cherry", "date", "elderberry", "fig")

    // Split the list into chunks of 3 elements
    val chunkedWords = words.chunked(3)

    println("Original words: $words")
    println("Chunked into size 3: $chunkedWords")
}
