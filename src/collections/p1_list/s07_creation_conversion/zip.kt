package collections.p1_list.s07_creation_conversion

/**
 * zip - Combines two collections into a list of pairs, where each pair consists of elements from the two collections at the same index.
 * This function is useful for pairing elements from two different collections and creating a combined collection of those pairs.
 **/

fun main(){
    // Example: Zipping two lists of numbers and words
    val numbers = listOf(1, 2, 3)
    val words = listOf("one", "two", "three")

    // Combine the two lists into pairs
    val zippedList = numbers.zip(words)

    println("Numbers: $numbers")
    println("Words: $words")
    println("Zipped list (number -> word): $zippedList")

    println("\n------\n")

    anotherZipExample()
}

// Another example
fun anotherZipExample(){
    // Example: Zipping two lists of different sizes
    val list1 = listOf("A", "B", "C")
    val list2 = listOf(1, 2)

    // Combine the two lists into pairs (shortest collection determines size)
    val zippedList = list1.zip(list2)

    println("List 1: $list1")
    println("List 2: $list2")
    println("Zipped list (letter -> number): $zippedList")
}
