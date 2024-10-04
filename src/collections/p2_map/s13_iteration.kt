package collections.p2_map

/**
 * forEach - Iterates through key-value pairs.
 * mapValues - Transforms all values while keeping the keys unchanged.
 * mapKeys - Transforms all keys while keeping the values unchanged.
 */

fun main() {
    // Example: forEach (Iterate through key-value pairs)
    val sampleMap = mapOf("name" to "Alice", "age" to 25, "city" to "Vancouver")
    println("Iterating with forEach:")
    sampleMap.forEach { (key, value) ->
        println("$key -> $value")
    }

    // Example: mapValues (Transform all values, keep keys unchanged)
    val updatedValuesMap = sampleMap.mapValues { entry -> "${entry.value} (updated)" }
    println("Map after mapValues: $updatedValuesMap")

    // Example: mapKeys (Transform all keys, keep values unchanged)
    val updatedKeysMap = sampleMap.mapKeys { entry -> entry.key.uppercase() }
    println("Map after mapKeys: $updatedKeysMap")

    println("\n------\n")

    anotherIterationExample()
}

// Another example
fun anotherIterationExample() {
    val userDetails = mutableMapOf("username" to "jane_doe", "email" to "jane@example.com", "age" to 28)

    // forEach to print all entries
    println("User details with forEach:")
    userDetails.forEach { (key, value) ->
        println("$key -> $value")
    }

    // mapValues to update age with a prefix and suffix
    val modifiedUserDetails = userDetails.mapValues { (key, value) ->
        if (key == "age") "Age: $value years" else value
    }
    println("User details after mapValues: $modifiedUserDetails")

    // mapKeys to add a prefix to the keys
    val prefixedKeysMap = userDetails.mapKeys { (key, _) -> "user_$key" }
    println("User details after mapKeys: $prefixedKeysMap")
}
