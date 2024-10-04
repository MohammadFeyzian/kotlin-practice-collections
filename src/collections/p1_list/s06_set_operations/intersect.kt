package collections.p1_list.s06_set_operations

/**
 * intersect - Returns a collection containing only the elements that are present in both collections.
 * This function is useful for finding the common elements shared between two collections.
 **/

fun main(){
    // Example: Intersection of two lists of numbers
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(3, 4, 5, 6, 7)

    val inters = list1.intersect(list2)

    // Get the common elements between list1 and list2
    val commonElements = list1.intersect(list2)

    println("List 1: $list1")
    println("List 2: $list2")
    println("Common elements (intersection): $commonElements")

    println("\n------\n")

    anotherIntersectExample()
}

// Another example
fun anotherIntersectExample(){
    // Example: Intersection of two lists of strings
    val animals1 = listOf("dog", "cat", "rabbit")
    val animals2 = listOf("rabbit", "parrot", "cat")

    // Get the common animals between both lists
    val commonAnimals = animals1.intersect(animals2)

    println("Animals 1: $animals1")
    println("Animals 2: $animals2")
    println("Common animals (intersection): $commonAnimals")
}
