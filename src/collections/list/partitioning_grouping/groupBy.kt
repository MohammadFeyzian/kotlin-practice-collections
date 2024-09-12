package collections.list.partitioning_grouping

/**
 * groupBy - Groups elements of a collection by a specified key and returns a map.
 * The key is determined by the given lambda function. Each group of elements is stored
 * in a list associated with its respective key in the resulting map.
 **/

fun main(){
    // Example: Grouping a list of strings by their first character
    val words = listOf("apple", "apricot", "banana", "blueberry", "cherry")

    val gb = words.groupBy { it.first() }

    // Group the words by their first character
    val groupedWords = words.groupBy { it.first() }

    println("Original words: $words")
    println("Words grouped by first letter: $groupedWords")

    println("\n------\n")

    anotherGroupByExample()
}

// Another example
fun anotherGroupByExample(){
    // Example: Grouping a list of numbers by their remainder when divided by 3
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Group the numbers based on the remainder when divided by 3
    val groupedNumbers = numbers.groupBy { it % 3 }

    println("Original numbers: $numbers")
    println("Numbers grouped by remainder when divided by 3: $groupedNumbers")
}
