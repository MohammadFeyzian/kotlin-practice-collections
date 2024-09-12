package collections.others

/**
 * orEmpty - Returns an empty list if the collection is null.
 * This function is useful when you want to safely handle nullable collections without having to check for null explicitly.
 **/

fun main(){
    // Example: Using orEmpty on a nullable list
    val nullableNumbers: List<Int>? = null

    // Return an empty list if nullableNumbers is null
    val numbers = nullableNumbers.orEmpty()

    println("Nullable numbers: $nullableNumbers")
    println("Numbers (with orEmpty): $numbers")

    println("\n------\n")

    anotherOrEmptyExample()
}

// Another example
fun anotherOrEmptyExample(){
    // Example: Using orEmpty on a non-null list
    val nullableWords: List<String>? = listOf("apple", "banana", "cherry")

    // Return the list itself if not null, or an empty list if null
    val words = nullableWords.orEmpty()

    println("Nullable words: $nullableWords")
    println("Words (with orEmpty): $words")
}
