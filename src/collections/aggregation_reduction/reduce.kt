package collections.aggregation_reduction

/**
 * reduce - Combines elements of a collection into a single result by applying a given operation sequentially from left to right.
 * The first element is used as the initial accumulator value, and the operation is applied to the next element and the current accumulator.
 *
 * Example:
 * If you have a list of numbers and you want to sum them, you can use the reduce function.
 **/

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // Using reduce to sum all the numbers in the list
    val sum = numbers.reduce { acc, number -> acc + number }

    println("Original numbers: $numbers")
    println("Sum of all numbers using reduce: $sum")

    println("\n------\n")

    otherReduceExample()
}

// Additional reduce example
fun otherReduceExample() {
    val words = listOf("Kotlin", "is", "awesome")

    // Using reduce to concatenate all the words into a single sentence
    val sentence = words.reduce { acc, word -> "$acc $word" }

    println("Original words: $words")
    println("Sentence formed using reduce: $sentence")
}
