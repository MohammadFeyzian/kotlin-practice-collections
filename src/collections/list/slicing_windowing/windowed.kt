package collections.list.slicing_windowing

/**
 * windowed - Creates a sliding window of elements from the collection.
 * Each window contains a fixed number of elements, and the windows can optionally overlap.
 * This function is useful for processing overlapping or consecutive subsets of elements.
 **/

fun main(){
    // Example: Creating a sliding window of size 3 from a list of numbers
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    numbers.windowed(3, 2)

    // Create windows of size 3 with default step size of 1 (overlapping)
    val windowedNumbers = numbers.windowed(3)

    println("Original numbers: $numbers")
    println("Windowed into size 3: $windowedNumbers")

    println("\n------\n")

    anotherWindowedExample()
}

// Another example
fun anotherWindowedExample(){
    // Example: Creating non-overlapping windows of size 2 from a list of strings
    val words = listOf("apple", "banana", "cherry", "date", "elderberry", "fig", "orange")

    // Create windows of size 2 with a step size of 2 (non-overlapping)
    val windowedWords = words.windowed(2, step = 2, true)

    println("Original words: $words")
    println("Windowed into size 2 with step 2: $windowedWords")
}
