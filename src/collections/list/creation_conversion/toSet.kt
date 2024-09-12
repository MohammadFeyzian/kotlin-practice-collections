package collections.list.creation_conversion

/**
 * toSet - Converts a collection (such as a list, sequence, or other iterable) into a Set.
 * A Set only contains unique elements, so any duplicates in the original collection will be removed.
 * This function is useful when you need to ensure that a collection contains only unique elements.
 **/

fun main(){
    // Example: Converting a list with duplicate elements to a set
    val numberList = listOf(1, 2, 2, 3, 4, 4, 5)

    // Convert the list to a set to remove duplicates
    val numberSet = numberList.toSet()

    println("Original list: $numberList")
    println("Converted to set (duplicates removed): $numberSet")

    println("\n------\n")

    anotherToSetExample()
}

// Another example
fun anotherToSetExample(){
    // Example: Converting a sequence to a set
    val numberSequence = sequenceOf(10, 20, 20, 30, 40, 50, 50)

    // Convert the sequence to a set
    val numberSetFromSequence = numberSequence.toSet()

    println("Original sequence: $numberSequence")
    println("Converted to set (duplicates removed): $numberSetFromSequence")
}
