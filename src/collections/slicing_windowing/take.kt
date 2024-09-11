package collections.slicing_windowing

/**
 * take - Returns a list containing the first N elements from the collection.
 * This function is useful when you need to limit a collection to the first N elements.
 **/

fun main(){
    // Example: Taking the first 3 elements from a list
    val numbers = listOf(1, 2, 3, 4, 5)

    // Take the first 3 elements from the list
    val firstThreeNumbers = numbers.take(3)

    println("Original numbers: $numbers")
    println("First 3 numbers: $firstThreeNumbers")

    println("\n------\n")

    anotherTakeExample()
}

// Another example
fun anotherTakeExample(){
    // Example: Taking the first 2 elements from a list of strings
    val words = listOf("apple", "banana", "cherry", "date")

    // Take the first 2 words
    val firstTwoWords = words.take(2)

    println("Original words: $words")
    println("First 2 words: $firstTwoWords")
}
