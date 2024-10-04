package collections.p1_list.s10_others

/**
 * requireNoNulls - Ensures that a collection contains no null elements.
 * If any element is null, this function throws an IllegalArgumentException.
 * This is useful when you need to ensure that a collection is fully populated and contains no null values.
 **/

fun main(){
    // Example: Ensuring no null elements in a list of numbers
    val numbersWithNulls = listOf(1, 2, null, 4, 5)

    try {
        // This will throw an exception because the list contains null
        val validNumbers = numbersWithNulls.requireNoNulls()
        println("Numbers without nulls: $validNumbers")
    } catch (e: IllegalArgumentException) {
        println("Exception caught: ${e.message}")
    }

    println("\n------\n")

    anotherRequireNoNullsExample()
}

// Another example
fun anotherRequireNoNullsExample(){
    // Example: Ensuring no null elements in a list of strings
    val wordsWithoutNulls = listOf("apple", "banana", "cherry")

    try {
        // This will pass because the list has no nulls
        val validWords = wordsWithoutNulls.requireNoNulls()
        println("Words without nulls: $validWords")
    } catch (e: IllegalArgumentException) {
        println("Exception caught: ${e.message}")
    }
}
