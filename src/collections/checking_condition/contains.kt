package collections.checking_condition

/**
 * contains - Checks if a specific element is present in the collection.
 * It returns `true` if the element is found, otherwise `false`.
 * This function is useful for determining if a collection contains a particular value.
 **/

fun main(){
    // Example: Checking if a list contains a specific number
    val numbers = listOf(1, 2, 3, 4, 5)

    // Check if the list contains the number 3
    val containsThree = numbers.contains(3)

    println("Original numbers: $numbers")
    println("Does the list contain the number 3? $containsThree")

    println("\n------\n")

    anotherContainsExample()
}

// Another example
fun anotherContainsExample(){
    // Example: Checking if a list contains a specific string
    val words = listOf("Kotlin", "Android", "Development")

    // Check if the list contains the word "Java"
    val containsJava = words.contains("Java")

    println("Original words: $words")
    println("Does the list contain the word 'Java'? $containsJava")
}
