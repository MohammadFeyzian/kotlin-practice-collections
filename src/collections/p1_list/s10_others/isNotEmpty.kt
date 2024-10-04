package collections.p1_list.s10_others

/**
 * isNotEmpty - Checks if the collection is not empty.
 * It returns `true` if the collection contains at least one element, otherwise `false`.
 * This function is useful when you need to ensure that a collection contains elements before performing operations on it.
 **/

fun main(){
    // Example: Checking if a list of numbers is not empty
    val numbers = listOf(1, 2, 3)

    // Check if the list is not empty
    val isNumbersNotEmpty = numbers.isNotEmpty()

    println("Numbers: $numbers")
    println("Is the list of numbers not empty? $isNumbersNotEmpty")

    println("\n------\n")

    anotherIsNotEmptyExample()
}

// Another example
fun anotherIsNotEmptyExample(){
    // Example: Checking if a list of strings is not empty
    val words = listOf<String>()

    // Check if the list is not empty
    val isWordsNotEmpty = words.isNotEmpty()

    println("Words: $words")
    println("Is the list of words not empty? $isWordsNotEmpty")
}
