package collections.p1_list.s07_creation_conversion

/**
 * minus - Removes elements or subtracts one collection from another.
 * When used on a collection, it returns a new collection with the specified elements or collection removed.
 * This function is useful for excluding specific elements or collections from a collection.
 **/

fun main(){
    // Example: Removing an element from a list
    val numbers = listOf(1, 2, 3, 4, 5)

    // Remove a single element from the list
    val updatedNumbers = numbers - 3

    println("Original numbers: $numbers")
    println("Numbers after removing 3: $updatedNumbers")

    println("\n------\n")

    anotherMinusExample()
}

// Another example
fun anotherMinusExample(){
    // Example: Removing elements of one list from another list
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(3, 4)

    // Subtract list2 from list1
    val difference = list1 - list2

    println("List 1: $list1")
    println("List 2: $list2")
    println("List 1 after subtracting elements from List 2: $difference")
}
