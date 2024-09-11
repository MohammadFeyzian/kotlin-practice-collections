package collections.slicing_windowing

/**
 * drop - Returns a list containing all elements except the first N elements from the collection.
 * This function is useful when you need to skip the first N elements and work with the rest of the collection.
 **/

fun main(){
    // Example: Dropping the first 2 elements from a list
    val numbers = listOf(1, 2, 3, 4, 5)

    // Drop the first 2 elements from the list
    val remainingNumbers = numbers.drop(2)

    println("Original numbers: $numbers")
    println("Numbers after dropping the first 2: $remainingNumbers")

    println("\n------\n")

    anotherDropExample()
}

// Another example
fun anotherDropExample(){
    // Example: Dropping the first 3 elements from a list of strings
    val words = listOf("apple", "banana", "cherry", "date")

    // Drop the first 3 words
    val remainingWords = words.drop(3)

    println("Original words: $words")
    println("Words after dropping the first 3: $remainingWords")
}
