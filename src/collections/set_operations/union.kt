package collections.set_operations

/**
 * union - Combines two collections and returns a new collection without duplicates.
 * It returns a collection containing all elements from both collections, but ensures that no element appears more than once.
 * This function is useful when you need to merge collections while avoiding duplication.
 **/

fun main(){
    // Example: Union of two lists of numbers
    val list1 = listOf(1, 2, 3, 4)
    val list2 = listOf(3, 4, 5, 6)

    // Combine both lists without duplicates
    val unionList = list1.union(list2)

    println("List 1: $list1")
    println("List 2: $list2")
    println("Union of both lists: $unionList")

    println("\n------\n")

    anotherUnionExample()
}

// Another example
fun anotherUnionExample(){
    // Example: Union of two lists of strings
    val fruits1 = listOf("apple", "banana", "cherry")
    val fruits2 = listOf("banana", "dragonfruit", "elderberry")

    // Combine both lists of fruits without duplicates
    val unionFruits = fruits1.union(fruits2)

    println("Fruits 1: $fruits1")
    println("Fruits 2: $fruits2")
    println("Union of both fruit lists: $unionFruits")
}
