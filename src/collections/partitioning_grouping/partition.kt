package collections.partitioning_grouping

/**
 * partition - Splits a collection into two lists based on a predicate.
 * The first list contains elements that match the predicate, while the second
 * contains elements that do not. It is useful for grouping elements into two categories.
 **/

fun main(){
    // Example: Partition a list of integers into even and odd numbers
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Partition the list into even and odd numbers
    val (evenNumbers, oddNumbers) = numbers.partition { it % 2 == 0 }

    println("Original numbers: $numbers")
    println("Even numbers: $evenNumbers")
    println("Odd numbers: $oddNumbers")

    println("\n------\n")

    anotherExample()
}

// Another example
fun anotherExample(){
    // Example: Partitioning a list of strings based on string length
    val words = listOf("Kotlin", "is", "fun", "and", "powerful")

    // Partition the words based on whether their length is greater than 3
    val (longWords, shortWords) = words.partition { it.length > 3 }

    println("Original words: $words")
    println("Words with length > 3: $longWords")
    println("Words with length <= 3: $shortWords")
}
