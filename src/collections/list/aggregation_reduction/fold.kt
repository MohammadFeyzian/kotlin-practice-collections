package collections.list.aggregation_reduction

/**
 * fold - Accumulates a value by applying an operation to the elements of the collection,
 * starting with an initial value provided by the user. The result is stored in the accumulator.
 *
 * Example:
 * If you have a list of numbers and you want to sum them starting from a specific initial value,
 * you can use the fold function.
 **/

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // Using fold to sum the numbers, starting with an initial value of 10
    val sumWithInitial = numbers.fold(10) { acc, number -> acc + number }

    println("Original numbers: $numbers")
    println("Sum of all numbers starting with initial value 10 using fold: $sumWithInitial")

    println("\n------\n")

    otherFoldExample()
}

// Additional fold example
fun otherFoldExample() {
    val words = listOf("Kotlin", "is", "awesome")

    // Using fold to concatenate words into a sentence, starting with an initial value "Language:"
    val sentenceWithInitial = words.fold("Language:") { acc, word -> "$acc $word" }

    println("Original words: $words")
    println("Sentence formed using fold with initial value: $sentenceWithInitial")
}
