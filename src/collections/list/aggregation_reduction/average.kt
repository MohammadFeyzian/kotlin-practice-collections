package collections.list.aggregation_reduction

/**
 * average - Calculates the average (mean) of numerical values in the collection.
 * It returns the average as a Double.
 *
 * Example:
 * If you have a list of numbers and you want to find the average of these values,
 * you can use the average function.
 **/

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // Using average to calculate the average of the numbers in the list
    val averageValue = numbers.average()

    println("Original numbers: $numbers")
    println("Average of the numbers: $averageValue")

    println("\n------\n")

    otherAverageExample()
}

// Additional average example
fun otherAverageExample() {
    data class Product(val name: String, val price: Double)

    val products = listOf(
        Product("Laptop", 1200.0),
        Product("Phone", 800.0),
        Product("Tablet", 600.0)
    )

    // Using map and average to calculate the average price of the products
    val averagePrice = products.map { it.price }.average()

    println("Original products: $products")
    println("Average price of the products: $averagePrice")
}
