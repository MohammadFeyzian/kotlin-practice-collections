package collections.list.creation_conversion

/**
 * associateWith - Converts a collection into a Map by using each element as the key and applying a transformation to create the value.
 * This function is useful when the keys come from the elements themselves, and the values are derived from those elements.
 **/

fun main(){
    // Example: Associating each word in the list with its length
    val words = listOf("apple", "banana", "cherry")

    // Convert the list of words to a map where the word is the key and its length is the value
    val wordLengthMap = words.associateWith { it.length }

    println("Original list of words: $words")
    println("Converted to map (word -> length): $wordLengthMap")

    println("\n------\n")

    anotherAssociateWithExample()
}

// Another example
fun anotherAssociateWithExample(){
    // Example: Associating each number in the list with its square
    val numbers = listOf(1, 2, 3, 4, 5)

    // Convert the list of numbers to a map where the number is the key and its square is the value
    val numberSquareMap = numbers.associateWith { it * it }

    println("Original list of numbers: $numbers")
    println("Converted to map (number -> square): $numberSquareMap")
}
