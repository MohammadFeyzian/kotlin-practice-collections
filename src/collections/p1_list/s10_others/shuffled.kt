package collections.p1_list.s10_others

/**
 * shuffled - Returns a new collection with its elements randomly shuffled.
 * This function is useful when you need to randomize the order of elements in a collection.
 **/

fun main(){
    // Example: Shuffling a list of numbers
    val numbers = listOf(1, 2, 3, 4, 5)

    // Return a shuffled version of the list
    val shuffledNumbers = numbers.shuffled()

    println("Original numbers: $numbers")
    println("Shuffled numbers: $shuffledNumbers")

    println("\n------\n")

    anotherShuffledExample()
}

// Another example
fun anotherShuffledExample(){
    // Example: Shuffling a list of strings
    val words = listOf("apple", "banana", "cherry", "date", "elderberry")

    // Return a shuffled version of the list
    val shuffledWords = words.shuffled()

    println("Original words: $words")
    println("Shuffled words: $shuffledWords")
}
