package collections.p1_list.s07_creation_conversion

/**
 * toMap - Converts a collection of key-value pairs (or objects that can be mapped to key-value pairs) into a Map.
 * A Map stores elements in key-value pairs, where keys must be unique. This function is useful when you want to organize data into key-value pairs.
 **/

fun main() {
    // Example: Converting a list of pairs to a map
    val pairList = listOf(
        1 to "One",
        2 to "Two",
        3 to "Three"
    )

    // Convert the list of pairs to a map
    val numberMap = pairList.toMap()

    println("Original list of pairs: $pairList")
    println("Converted to map: $numberMap")
}