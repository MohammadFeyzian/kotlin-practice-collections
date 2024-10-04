package collections.p1_list.s07_creation_conversion

/**
 * unzip - Separates a collection of pairs into two collections (one for each component of the pair).
 * This function is useful for breaking down a collection of pairs into two lists, one containing the first elements and the other containing the second elements.
 **/

fun main(){
    // Example: Unzipping a list of pairs of numbers and words
    val zippedList = listOf(1 to "one", 2 to "two", 3 to "three")

    // Separate the pairs into two lists
    val (numbers, words) = zippedList.unzip()

    println("Zipped list: $zippedList")
    println("Unzipped numbers: $numbers")
    println("Unzipped words: $words")

    println("\n------\n")

    anotherUnzipExample()
}

// Another example
fun anotherUnzipExample(){
    // Example: Unzipping a list of pairs of letters and numbers
    val zippedList = listOf('A' to 1, 'B' to 2, 'C' to 3)

    // Separate the pairs into two lists
    val (letters, numbers) = zippedList.unzip()

    println("Zipped list: $zippedList")
    println("Unzipped letters: $letters")
    println("Unzipped numbers: $numbers")
}
