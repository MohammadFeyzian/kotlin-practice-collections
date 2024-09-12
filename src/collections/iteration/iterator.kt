package collections.iteration

/**
 * iterator - Provides an iterator over the elements of the collection.
 * You can use the iterator to manually iterate through the collection elements using hasNext() and next().
 *
 * Example:
 * If you want to manually control the iteration over a list or collection,
 * you can use the iterator function to obtain an iterator and loop through the elements.
 **/

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // Getting an iterator for the list of numbers
    val numberIterator = numbers.iterator()

    // Using the iterator to manually iterate through the list
    while (numberIterator.hasNext()) {
        val number = numberIterator.next()
        println("Number: $number")
    }

    println("\n------\n")

    otherIteratorExample()
}

// Additional iterator example
fun otherIteratorExample() {
    val names = listOf("Alice", "Bob", "Charlie")

    // Getting an iterator for the list of names
    val nameIterator = names.iterator()

    // Manually iterating through the names
    while (nameIterator.hasNext()) {
        val name = nameIterator.next()
        println("Name: $name")
    }
}
