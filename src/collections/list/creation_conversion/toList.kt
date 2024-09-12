package collections.list.creation_conversion

/**
 * toList - Converts a collection (such as a set, sequence, or other iterable) into a List.
 * This function is useful when you need to ensure that a collection is a list and want to use list-specific functions or operations.
 **/

fun main(){
    // Example: Converting a set to a list
    val numberSet = setOf(1, 2, 3, 4, 5)

    // Convert the set to a list
    val numberList = numberSet.toList()

    println("Original set: $numberSet")
    println("Converted to list: $numberList")

    println("\n------\n")

    anotherToListExample()
}

// Another example
fun anotherToListExample(){
    // Example: Converting a sequence to a list
    val numberSequence = sequenceOf(10, 20, 30, 40, 50)

    // Convert the sequence to a list
    val numberListFromSequence = numberSequence.toList()

    println("Original sequence: $numberSequence")
    println("Converted to list: $numberListFromSequence")
}
