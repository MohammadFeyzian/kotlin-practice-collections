package collections.p1_list.s02_aggregation_reduction

/**
 * sumOf - Sums the values returned by a selector function applied to each element in the collection.
 * This is useful when you want to sum the values of a specific property of the elements.
 *
 * Example:
 * If you have a list of objects and you want to sum up a specific property like age or price,
 * you can use sumOf to achieve this.
 **/

fun main() {
    data class Person(val name: String, val age: Int)

    val people = listOf(
        Person("Alice", 30),
        Person("Bob", 25),
        Person("Charlie", 35),
        Person("David", 28)
    )

    // Using sumOf to sum up the age of all people in the list
    val totalAge = people.sumOf { it.age }

    println("Original list of people: $people")
    println("Total age of all people using sumOf: $totalAge")

    println("\n------\n")

    otherSumOfExample()
}

// Additional sumOf example
fun otherSumOfExample() {
    data class Product(val name: String, val price: Int)

    val products = listOf(
        Product("Laptop", 1200),
        Product("Phone", 800),
        Product("Tablet", 600)
    )

    // Using sumOf to sum up the prices of all products in the list
    val totalPrice = products.sumOf { it.price }

    println("Original products: $products")
    println("Total price of all products using sumOf: $totalPrice")
}
