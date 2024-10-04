package collections.p1_list.s01_transformation

/**
 * sortedBy - Sorts the collection based on a specific property or selector function.
 * It returns a new list with elements sorted according to the specified selector.
 *
 * Example:
 * If you have a list of objects and you want to sort them based on one of their properties,
 * you can use the sortedBy function to achieve this.
 **/

fun main() {
    data class Person(val name: String, val age: Int)

    val people = listOf(
        Person("Alice", 30),
        Person("Charlie", 25),
        Person("Bob", 25),
        Person("David", 28)
    )

    // Using sortedBy to sort people by age
    val sortedByAge = people.sortedBy { it.age }

    println("Original list:")
    people.forEach { println(it) }

    println("\nSorted list by age:")
    sortedByAge.forEach { println(it) }

    println("\n------\n")

    otherSortedByExample()
}

// Additional sortedBy example
fun otherSortedByExample() {
    val words = listOf("banana", "apple", "cherry", "date")

    // Using sortedBy to sort words by their length
    val sortedByLength = words.sortedBy { it.length }

    println("Original words: $words")
    println("Words sorted by length: $sortedByLength")
}
