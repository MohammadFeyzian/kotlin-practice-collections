package collections.aggregation_reduction

/**
 * maxBy - Finds the element in the collection that has the maximum value based on a given property.
 * It returns the element with the largest value according to the selector function.
 *
 * maxOf- It returns the largest value
 *
 * Example:
 * If you have a list of objects and want to find the one with the maximum value for a specific property,
 * like age or price, you can use maxBy.
 **/

fun main() {
    data class Person(val name: String, val age: Int)

    val people = listOf(
        Person("Alice", 30),
        Person("Bob", 25),
        Person("Charlie", 35),
        Person("David", 28)
    )

    // Using maxBy to find the person with the maximum age
    val oldestPerson = people.maxByOrNull { it.age } // Returns the element
    val largestAge = people.maxOf { it.age } // Returns the value

    println("Original list of people: $people")
    println("Person with the maximum age: $oldestPerson")

    println("\n------\n")

    otherMaxByExample()
}

// Additional maxBy example
fun otherMaxByExample() {
    data class Product(val name: String, val price: Int)

    val products = listOf(
        Product("Laptop", 1200),
        Product("Phone", 800),
        Product("Tablet", 600)
    )

    // Using maxBy to find the product with the highest price
    val mostExpensiveProduct = products.maxByOrNull { it.price } // Returns the element
    val largestPrice = products.maxOf { it.price } // Returns the value

    println("Original products: $products")
    println("Product with the highest price: $mostExpensiveProduct")
}
