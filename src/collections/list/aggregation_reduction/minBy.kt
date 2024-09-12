package collections.list.aggregation_reduction

/**
 * minBy - Finds the element in the collection that has the minimum value based on a given property.
 * It returns the element with the smallest value according to the selector function.
 *
 * minOf - Returns the minimum value
 *
 * Example:
 * If you have a list of objects and want to find the one with the minimum value for a specific property,
 * like age or price, you can use minBy.
 **/

fun main() {
    data class Person(val name: String, val age: Int)

    val people = listOf(
        Person("Alice", 30),
        Person("Bob", 25),
        Person("Charlie", 35),
        Person("David", 28)
    )

    // Using minBy to find the person with the minimum age
    val youngestPerson = people.minByOrNull { it.age } // Returns minimum element
    val minValue = people.minOf { it.age } // Returns minimum value

    println("Original list of people: $people")
    println("Person with the minimum age: $youngestPerson")

    println("\n------\n")

    otherMinByExample()
}

// Additional minBy example
fun otherMinByExample() {
    data class Product(val name: String, val price: Int)

    val products = listOf(
        Product("Laptop", 1200),
        Product("Phone", 800),
        Product("Tablet", 600)
    )

    // Using minBy to find the product with the lowest price
    val cheapestProduct = products.minByOrNull { it.price } // Returns the minimum element
    val minValue = products.minOf { it.price } // Returns the minimum value

    println("Original products: $products")
    println("Product with the lowest price: $cheapestProduct")
}
