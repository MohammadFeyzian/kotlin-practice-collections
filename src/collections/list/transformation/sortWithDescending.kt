package collections.list.transformation

/**
 * sortedWith - Sorts the collection with a custom comparator.
 * You can use compareByDescending and thenByDescending to create a multi-level descending sort.
 *
 * Example:
 * If you have a list of objects and want to sort them first by one property in descending order,
 * then by another property in descending order in case of a tie, use sortedWith.
 **/

fun main() {
    data class Person(val name: String, val age: Int, val height: Int)

    val people = listOf(
        Person("Alice", 30, 165),
        Person("Bob", 25, 175),
        Person("Charlie", 30, 170),
        Person("David", 25, 165)
    )

    // Using sortedWith to first sort by age in descending order, then by height in descending order
    val sortedByAgeThenHeightDescending = people.sortedWith(
        compareByDescending<Person> { it.age }
            .thenByDescending { it.height }
            .thenByDescending { it.name }
    )

    println("Original list:")
    people.forEach { println(it) }

    println("\nSorted list by age (descending), then by height (descending):")
    sortedByAgeThenHeightDescending.forEach { println(it) }

    println("\n------\n")

    otherSortedWithDescendingExample()
}

// Additional sortedWith descending example
fun otherSortedWithDescendingExample() {
    data class Product(val name: String, val price: Double, val rating: Int)

    val products = listOf(
        Product("Laptop", 1200.0, 5),
        Product("Phone", 800.0, 4),
        Product("Tablet", 800.0, 5),
        Product("Monitor", 300.0, 4)
    )

    // Using sortedWith to sort by price in descending order, then by rating in descending order
    val sortedByPriceThenRatingDescending = products.sortedWith(
        compareByDescending<Product> { it.price }
            .thenByDescending { it.rating }
    )

    println("Original products: $products")
    println("Products sorted by price (descending), then by rating (descending):")
    sortedByPriceThenRatingDescending.forEach { println(it) }
}
