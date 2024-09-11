package collections.element_access

/**
 * first - Retrieves the first element of the collection.
 * If the collection is empty, it throws a NoSuchElementException.
 * This is useful when you are sure the collection has at least one element and you need the first element.
 **/

fun main(){
    // Example: Getting the first element from a list
    val numbers = listOf(1, 2, 3, 4, 5)

    // Get the first element
    val firstElement = numbers.first()
    val firstElementOrNull = numbers.firstOrNull() // Return null instead of NoSuchElementException exception

    println("Original numbers: $numbers")
    println("First element: $firstElement")

    println("\n------\n")

    anotherFirstExample()
}

// Another example
fun anotherFirstExample(){
    // Example: Trying to get the first element from an empty list (will throw an exception)
    val emptyList = emptyList<String>()

    try {
        // Attempt to get the first element, which will throw an exception
        val firstElement = emptyList.first()
        val firstElementOrNull = emptyList.firstOrNull()
        println("First element in empty list: $firstElement")
    } catch (e: NoSuchElementException) {
        println("Exception caught: ${e.message} (list is empty, cannot retrieve first element)")
    }
}
