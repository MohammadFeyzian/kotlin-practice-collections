package collections.map

/**
 * keys - Get a Set of all keys in the map.
 * values - Get a Collection of all values in the map.
 * entries - Get a Set of map entries (key-value pairs).
 * plus - Merge two maps together.
 * minus - Remove a key or multiple keys from a map.
 *
 * MutableMap: plusAssign, minusAssign
 */

fun main() {
    val sampleMap = mapOf("name" to "Alice", "age" to 25, "city" to "Vancouver")

    // Example: keys (Get a Set of all keys)
    val keys = sampleMap.keys
    println("Keys in the map: $keys")

    // Example: values (Get a Collection of all values)
    val values = sampleMap.values
    println("Values in the map: $values")

    // Example: entries (Get a Set of map entries (key-value pairs))
    val entries = sampleMap.entries
    println("Entries in the map: $entries")

    // Example: plus (Merge two maps)
    val additionalMap = mapOf("profession" to "Engineer", "hobby" to "Cycling")
    val mergedMap = sampleMap + additionalMap
    println("Merged map with plus: $mergedMap")

    // Example: minus (Remove a key or multiple keys)
    val mapAfterRemoval = mergedMap - "age"
    println("Map after removing 'age' key with minus: $mapAfterRemoval")

    val mapAfterMultipleRemovals = mergedMap - listOf("age", "city")
    println("Map after removing 'age' and 'city' keys with minus: $mapAfterMultipleRemovals")

    // MutableMap
    val mutableMap = mutableMapOf("name" to "Alice", "age" to 25, "city" to "Vancouver")

    mutableMap += "Next key" to "Next value" // plusAssign
    mutableMap -= "Some key" // minusAssign
    mutableMap -= listOf("firsts key", "second key") // minusAssign

    println("\n------\n")

    anotherMapUtilitiesExample()
}

// Another example
fun anotherMapUtilitiesExample() {
    val productMap = mutableMapOf("id" to 101, "name" to "Laptop", "price" to 1500, "category" to "Electronics")

    // keys: Get the set of keys from the product map
    val productKeys = productMap.keys
    println("Product keys: $productKeys")

    // values: Get the collection of values from the product map
    val productValues = productMap.values
    println("Product values: $productValues")

    // entries: Get the set of entries (key-value pairs) from the product map
    val productEntries = productMap.entries
    println("Product entries: $productEntries")

    // plus: Merge the product map with another map
    val additionalProductDetails = mapOf("stock" to 50, "brand" to "TechCorp")
    val updatedProductMap = productMap + additionalProductDetails
    println("Updated product map with plus: $updatedProductMap")

    // minus: Remove the 'price' and 'category' keys from the map
    val reducedProductMap = updatedProductMap - listOf("price", "category")
    println("Reduced product map with minus: $reducedProductMap")
}
