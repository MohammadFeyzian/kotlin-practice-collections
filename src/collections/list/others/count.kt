package collections.list.others

/**
 * count - Returns the number of elements in the collection.
 * This function is useful when you need to determine how many elements are present in a collection.
 **/

fun main(){
    // Example: Counting the elements in a list of numbers
    val numbers = listOf(1, 2, 3, 4, 5)

    // Count the number of elements in the list
    val numberCount = numbers.count()

    println("Numbers: $numbers")
    println("Number of elements in the list: $numberCount")

    println("\n------\n")

    anotherCountExample()
}

// Another example
fun anotherCountExample(){
    // Example: Counting elements in a list of strings that meet a condition
    val words = listOf("apple", "banana", "cherry", "date")

    // Count how many words have more than 5 characters
    val longWordCount = words.count { it.length > 5 }

    println("Words: $words")
    println("Number of words with more than 5 characters: $longWordCount")
}
