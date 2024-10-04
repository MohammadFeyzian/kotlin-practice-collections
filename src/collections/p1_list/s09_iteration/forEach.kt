package collections.p1_list.s09_iteration

/**
 * forEach - Iterates over each element in the collection and performs a specified action on each element.
 * It applies the given function to every item in the collection.
 *
 * Example:
 * If you have a list of numbers or objects and want to print or perform any operation on each element,
 * you can use the forEach function.
 **/

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // Using forEach to print each number in the list
    numbers.forEach { number ->
        println("Number: $number")
    }

    println("\n------\n")

    otherForEachExample()
}

// Additional forEach example
fun otherForEachExample() {
    data class Product(val name: String, val price: Double)

    val products = listOf(
        Product("Laptop", 1200.0),
        Product("Phone", 800.0),
        Product("Tablet", 600.0)
    )

    // Using forEach to print the name and price of each product
    products.forEach { product ->
        println("Product: ${product.name}, Price: ${product.price}")
    }
}
