package collections.p1_list.s03_element_access

/**
 * last - Retrieves the last element of the collection.
 * If the collection is empty, it throws a NoSuchElementException.
 * This function is useful when you are certain the collection contains at least one element and you need the last element.
 **/

fun main(){
    // Example: Getting the last element from a list
    val numbers = listOf(1, 2, 3, 4, 5)

    // Get the last element
    val lastElement = numbers.last()
    val lastElementOrNull = numbers.lastOrNull() // Return null instead of NoSuchElementException

    println("Original numbers: $numbers")
    println("Last element: $lastElement")

    println("\n------\n")

    anotherLastExample()
}

// Another example
fun anotherLastExample(){
    // Example: Trying to get the last element from an empty list (will throw an exception)
    val emptyList = emptyList<String>()

    try {
        // Attempt to get the last element, which will throw an exception
        val lastElement = emptyList.last()
        val lastElementOrNull = emptyList.lastOrNull() // Return null instead of NoSuchElementException
        println("Last element in empty list: $lastElement")
    } catch (e: NoSuchElementException) {
        println("Exception caught: ${e.message} (list is empty, cannot retrieve last element)")
    }
}
