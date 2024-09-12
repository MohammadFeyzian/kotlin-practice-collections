package collections.list.checking_condition

/**
 * none - Checks if no elements in the collection satisfy the given condition.
 * It returns `true` if none of the elements match the predicate; otherwise, it returns `false`.
 * This function is useful for ensuring that a collection does not contain any unwanted values.
 **/

fun main(){
    // Example: Checking if none of the numbers in the list are negative
    val numbers = listOf(1, 2, 3, 4, 5)

    // Check if none of the numbers are less than zero
    val noNegativeNumbers = numbers.none { it < 0 }

    println("Original numbers: $numbers")
    println("Are there no negative numbers? $noNegativeNumbers")

    println("\n------\n")

    anotherNoneExample()
}

// Another example
fun anotherNoneExample(){
    // Example: Checking if none of the strings in the list are empty
    val words = listOf("Kotlin", "Android", "Development")

    // Check if none of the words are empty
    val noEmptyWords = words.none { it.isEmpty() }

    println("Original words: $words")
    println("Are there no empty words? $noEmptyWords")
}
