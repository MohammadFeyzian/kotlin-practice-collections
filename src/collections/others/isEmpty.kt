package collections.others

/**
 * isEmpty - Checks if the collection is empty.
 * It returns `true` if the collection contains no elements, otherwise `false`.
 * This function is useful when you need to determine whether a collection has any elements or not.
 **/

fun main(){
    // Example: Checking if a list of numbers is empty
    val numbers = listOf<Int>()

    // Check if the list is empty
    val isNumbersEmpty = numbers.isEmpty()

    println("Numbers: $numbers")
    println("Is the list of numbers empty? $isNumbersEmpty")

    println("\n------\n")

    anotherIsEmptyExample()
}

// Another example
fun anotherIsEmptyExample(){
    // Example: Checking if a list of strings is empty
    val words = listOf("apple", "banana", "cherry")

    // Check if the list is empty
    val isWordsEmpty = words.isEmpty()

    println("Words: $words")
    println("Is the list of words empty? $isWordsEmpty")
}
