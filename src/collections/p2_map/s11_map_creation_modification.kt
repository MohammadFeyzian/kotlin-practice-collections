package collections.p2_map

/**
 * mapOf - Creates a read-only Map.
 * mutableMapOf - Creates a mutable Map.
 * put - Adds or replaces a key-value pair in a mutable map.
 * putAll - Adds all key-value pairs from another map to the current map.
 * remove - Removes an entry by its key.
 */

fun main() {
    // Example: mapOf (Read-only Map)
    val readOnlyMap = mapOf("name" to "Alice", "age" to 25)
    println("Read-Only Map: $readOnlyMap")

    // Example: mutableMapOf (Mutable Map)
    val mutableMap = mutableMapOf("name" to "Bob", "age" to 30)
    println("Initial Mutable Map: $mutableMap")

    // Example: put (Adding/Replacing an entry)
    mutableMap.put("city", "Vancouver") // Adding a new key-value pair
    mutableMap["city"]= "Vancouver" // Adding a new key-value pair
    println("After put (Add 'city'): $mutableMap")

    mutableMap.put("age", 31) // Replacing an existing key-value pair
    mutableMap["age"] = 31 // Replacing an existing key-value pair
    println("After put (Replace 'age'): $mutableMap")

    // Example: putAll (Add all from another map)
    val anotherMap = mapOf("country" to "Canada", "profession" to "Engineer")
    mutableMap.putAll(anotherMap)
    println("After putAll (Add another map): $mutableMap")

    // Example: remove (Remove an entry by key)
    mutableMap.remove("city")
    println("After remove (Remove 'city'): $mutableMap")

    println("\n------\n")

    anotherMapModificationExample()
}

// Another example
fun anotherMapModificationExample() {
    // Demonstrating mutable map manipulations with putAll and remove
    val personMap = mutableMapOf("firstName" to "John", "lastName" to "Doe", "age" to 28)
    println("Person Map before modification: $personMap")

    // Adding or replacing some entries
    personMap["age"] = 29 // Using bracket notation to replace a value (set)
    personMap["location"] = "Toronto"

    println("Person Map after modifications (put): $personMap")

    // Adding all key-value pairs from another map
    val additionalInfo = mapOf("profession" to "Developer", "hobby" to "Cycling")
    personMap.putAll(additionalInfo)

    println("Person Map after putAll: $personMap")

    // Removing a key-value pair
    personMap.remove("hobby")

    println("Person Map after removing 'hobby': $personMap")
}
