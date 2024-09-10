package collections.checking_condition

/**
 * all - Checks if all elements in the collection satisfy the given condition.
 * It returns `true` if every element matches the predicate; otherwise, it returns `false`.
 * This function is often used for validation when all elements need to meet certain criteria.
 **/

fun main(){
    // Example: Checking if all numbers in the list are positive
    val numbers = listOf(1, 2, 3, 4, 5)

    // Check if all numbers are greater than zero
    val areAllPositive = numbers.all { it > 0 }

    println("Original numbers: $numbers")
    println("Are all numbers positive? $areAllPositive")

    println("\n------\n")

    anotherAllExample()
}

// Another example
fun anotherAllExample(){
    // Example: Checking if all strings in the list have length greater than 3
    val words = listOf("Kotlin", "Android", "Dev")

    // Check if all words have length greater than 3
    val areAllLong = words.all { it.length > 3 }

    println("Original words: $words")
    println("Do all words have length greater than 3? $areAllLong")
}
