package collections.p1_list.s03_element_access

/**
 * elementAtOrNull - Safely retrieves an element at a given index from the collection.
 * If the index is out of bounds, it returns `null` instead of throwing an exception.
 * This function is useful for safely accessing elements when the index might not always be valid.
 **/

fun main(){
    // Example: Safely retrieving an element at a valid and an invalid index
    val numbers = listOf(1, 2, 3, 4, 5)

    // Get element at index 2
    val elementAtIndexTwo = numbers.elementAtOrNull(2)
    val elementAtIndexTwoOrElse = numbers.elementAtOrElse(2) { 4 } // Include a default value

    // Try to get an element at index 10 (out of bounds)
    val elementAtIndexTen = numbers.elementAtOrNull(10)

    println("Original numbers: $numbers")
    println("Element at index 2: $elementAtIndexTwo")
    println("Element at index 10 (out of bounds): $elementAtIndexTen")

    println("\n------\n")

    anotherElementAtOrNullExample()
}

// Another example
fun anotherElementAtOrNullExample(){
    // Example: Safely retrieving an element from an empty list
    val emptyList = emptyList<String>()

    // Try to get an element at index 0 from the empty list
    val elementAtIndexZero = emptyList.elementAtOrNull(0)
    val elementAtIndexZeroOrElse = emptyList.elementAtOrElse(0) { "List is empty" } // Include a default value

    println("Empty list: $emptyList")
    println("Element at index 0 in empty list: $elementAtIndexZero")
}
