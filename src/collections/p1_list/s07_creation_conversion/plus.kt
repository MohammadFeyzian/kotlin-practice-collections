package collections.p1_list.s07_creation_conversion

/**
 * plus - Adds elements to a collection or combines two collections.
 * When used on a collection, it returns a new collection with the added elements, preserving the original collection's type.
 * This function is useful for appending individual elements or merging collections.
 **/

fun main(){
    // Example: Adding an element to a list
    val numbers = listOf(1, 2, 3)
    val ml = mutableListOf(1, 2, 3)

    // Add a single element to the list
    val updatedNumbers = numbers + 4

    println("Original numbers: $numbers")
    println("Numbers after adding 4: $updatedNumbers")

    println("\n------\n")

    anotherPlusExample()
}

// Another example
fun anotherPlusExample(){
    // Example: Merging two lists using plus
    val list1 = listOf("A", "B", "C")
    val list2 = listOf("D", "E", "F")

    // Combine the two lists
    val combinedList = list1 + list2

    println("List 1: $list1")
    println("List 2: $list2")
    println("Combined list: $combinedList")
}
