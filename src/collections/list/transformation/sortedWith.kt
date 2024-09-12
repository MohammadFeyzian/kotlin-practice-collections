package collections.list.transformation

/**
 * sortedWith - Sorts the collection with a custom comparator.
 * You can use compareBy and thenBy to create a multi-level sort.
 *
 * Example:
 * If you have a list of objects and want to sort them first by one property,
 * then by another property in case of a tie, use sortedWith.
 **/

fun main() {
    data class Person(val name: String, val age: Int, val height: Int)

    val people = listOf(
        Person("Alice", 30, 165),
        Person("Bob", 25, 175),
        Person("Charlie", 30, 170),
        Person("David", 25, 165)
    )

    // Using sortedWith to first sort by age, then by height in case of a tie
    val sortedByAgeThenHeight = people.sortedWith(
        compareBy<Person> { it.age }
            .thenBy { it.height }
            .thenBy { it.name }
    )

    println("Original list:")
    people.forEach { println(it) }

    println("\nSorted list by age, then by height:")
    sortedByAgeThenHeight.forEach { println(it) }

    println("\n------\n")

    otherSortedWithExample()
}

// Additional sortedWith example
fun otherSortedWithExample() {
    data class Product(val name: String, val price: Double, val rating: Int)

    val products = listOf(
        Product("Laptop", 1200.0, 5),
        Product("Phone", 800.0, 4),
        Product("Tablet", 800.0, 5),
        Product("Monitor", 300.0, 4)
    )

    // Using sortedWith to sort by price, then by rating in case of a tie
    val sortedByPriceThenRating = products.sortedWith(
        compareBy<Product> { it.price }
            .thenByDescending { it.rating }
            .thenBy { it.name }
    )

    println("Original products: $products")
    println("Products sorted by price, then by rating:")
    sortedByPriceThenRating.forEach { println(it) }
}
