package collections.list.iteration

/**
 * onEach - Performs a given action on each element of the collection and returns the collection itself.
 * This is useful when you want to perform side effects on each element but still need the original collection.
 *
 * Example:
 * If you want to print or modify each element in a list, but still want to return the original collection for further operations,
 * you can use onEach.
 **/

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // Using onEach to print each number and still keep the original list
    val originalNumbers = numbers.onEach { number ->
        println("Processing number: $number")
    }

    println("Original list remains unchanged: $originalNumbers")

    println("\n------\n")

    otherOnEachExample()
}

// Additional onEach example
fun otherOnEachExample() {
    data class Product(val name: String, val price: Double)

    val products = listOf(
        Product("Laptop", 1200.0),
        Product("Phone", 800.0),
        Product("Tablet", 600.0)
    )

    // Using onEach to print product details but still return the collection
    val updatedProducts = products.onEach { product ->
        println("Product: ${product.name}, Price: ${product.price}")
    }

    println("The original collection of products is still available: $updatedProducts")
}
