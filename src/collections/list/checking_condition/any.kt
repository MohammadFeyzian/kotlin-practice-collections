package collections.list.checking_condition

/**
 * any - Checks if at least one element in the collection satisfies the given condition.
 * It returns `true` if any element matches the predicate; otherwise, it returns `false`.
 * This function is useful when you want to check if there’s at least one match in the collection.
 **/

fun main(){
    // Example: Checking if any number in the list is negative
    val numbers = listOf(1, -2, 3, 4, 5)

    // Check if any number is less than zero
    val hasNegative = numbers.any { it < 0 }

    println("Original numbers: $numbers")
    println("Is there any negative number? $hasNegative")

    println("\n------\n")

    anotherAnyExample()
}

// Another example
fun anotherAnyExample(){
    // Example: Checking if any string in the list is empty
    val words = listOf("Kotlin", "Android", "")

    // Check if any word is empty
    val hasEmptyWord = words.any { it.isEmpty() }

    println("Original words: $words")
    println("Is there any empty word? $hasEmptyWord")
}
