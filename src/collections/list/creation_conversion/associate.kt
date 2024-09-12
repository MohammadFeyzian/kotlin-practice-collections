package collections.list.creation_conversion

/**
 * associate - Converts a collection into a Map by applying a transformation to each element.
 * The transformation returns a key-value pair for each element, where the first part of the pair is the key and the second part is the value.
 * This function is useful for creating maps where the keys and values are derived from the elements of a collection.
 **/

fun main() {
    // Example: Associating elements in a list of strings to their lengths
    val words = listOf("apple", "banana", "cherry")

    // Convert the list of words to a map where the word is the key and its length is the value
    @Suppress("ReplaceAssociateFunction")
    val wordLengthMap = words.associate { it to it.length }

    println("Original list of words: $words")
    println("Converted to map (word -> length): $wordLengthMap")

    println("\n------\n")

    anotherAssociateExample()
}

// Another example
fun anotherAssociateExample() {
    // Example: Converting a list of custom objects to a map
    data class Person(val id: Int, val name: String)

    val peopleList: List<Person> = listOf(
        Person(1, "Alice"),
        Person(2, "Bob"),
        Person(3, "Charlie")
    )

    // Convert the list of Person objects to a map, using `id` as the key and `name` as the value
    val peopleMap = peopleList.associate { it.id to it.name }

    println("Original list of people: $peopleList")
    println("Converted to map (id -> name): $peopleMap")
}
