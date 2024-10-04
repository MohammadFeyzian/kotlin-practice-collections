package collections.p1_list.s03_element_access

/**
 * getOrNull - Safely retrieves an element at a given index from the collection.
 * If the index is out of bounds, it returns `null` instead of throwing an exception.
 * This is useful when accessing elements in lists where the index may not always be valid.
 **/

fun main(){
    // Example: Safely retrieving an element by index
    val numbers = listOf(1, 2, 3, 4, 5)

    // Safely get the element at index 2
    val elementAtTwo = numbers.getOrNull(2)

    // Try to get an element at an invalid index (e.g., 10)
    val elementAtTen = numbers.getOrNull(10)

    println("Original numbers: $numbers")
    println("Element at index 2: $elementAtTwo")
    println("Element at index 10 (out of bounds): $elementAtTen")

    println("\n------\n")

    anotherGetOrNullExample()
}

// Another example
fun anotherGetOrNullExample(){
    // Example: Safely retrieving an element from an empty list
    val emptyList = emptyList<String>()

    // Try to get an element at index 0 from an empty list
    val elementAtZero = emptyList.getOrNull(0)

    println("Empty list: $emptyList")
    println("Element at index 0 in empty list: $elementAtZero")
}
