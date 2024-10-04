package collections.p1_list.s01_transformation

/**
 * sortedDescending - Sorts the collection in descending order.
 * It returns a new list where elements are arranged in reverse natural order.
 *
 * Example:
 * If you have a list of numbers or strings and want to sort them in descending order,
 * you can use the sortedDescending function.
 **/

fun main() {
    val numbers = listOf(1, 5, 3, 8, 2, 9)

    // Using sortedDescending to sort the numbers in reverse order
    val sortedNumbersDescending = numbers.sortedDescending()

    println("Original numbers: $numbers")
    println("Numbers sorted in descending order: $sortedNumbersDescending")

    println("\n------\n")

    otherSortedDescendingExample()
}

// Additional sortedDescending example
fun otherSortedDescendingExample() {
    val words = listOf("banana", "apple", "cherry", "date")

    // Using sortedDescending to sort words in reverse alphabetical order
    val sortedWordsDescending = words.sortedDescending()

    println("Original words: $words")
    println("Words sorted in descending order: $sortedWordsDescending")
}
