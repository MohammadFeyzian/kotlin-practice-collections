package collections.p1_list.s07_creation_conversion

/**
 * associateBy - Converts a collection into a Map by using one of the element's properties as the key.
 * This function is useful when you want to map elements of a collection to a unique property from each element.
 **/

fun main(){
    // Example: Associating a list of people by their ID
    data class Person(val id: Int, val name: String)

    val peopleList = listOf(
        Person(1, "Alice"),
        Person(2, "Bob"),
        Person(3, "Charlie")
    )

    // Convert the list of people to a map, using the 'id' as the key
    val peopleMap = peopleList.associateBy { it.id }

    println("Original list of people: $peopleList")
    println("Converted to map (id -> person): $peopleMap")

    println("\n------\n")

    anotherAssociateByExample()
}

// Another example
fun anotherAssociateByExample(){
    // Example: Associating a list of words by their first letter
    val words = listOf("apple", "banana", "cherry", "avocado")

    // Convert the list of words to a map where the first letter of the word is the key
    val wordMap = words.associateBy { it.first() }

    println("Original list of words: $words")
    println("Converted to map (first letter -> word): $wordMap")
}
