package collections.others

/**
 * random - Returns a random element from the collection.
 * This function is useful when you need to randomly select an element from a collection.
 **/

fun main(){
    // Example: Getting a random number from a list of numbers
    val numbers = listOf(1, 2, 3, 4, 5)

    // Return a random element from the list
    val randomNumber = numbers.random()

    println("Original numbers: $numbers")
    println("Random number selected: $randomNumber")

    println("\n------\n")

    anotherRandomExample()
}

// Another example
fun anotherRandomExample(){
    // Example: Getting a random word from a list of strings
    val words = listOf("apple", "banana", "cherry", "date", "elderberry")

    // Return a random element from the list
    val randomWord = words.random()

    println("Original words: $words")
    println("Random word selected: $randomWord")
}
