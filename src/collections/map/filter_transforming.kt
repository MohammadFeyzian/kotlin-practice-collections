package collections.map

/**
 * filter - Filters entries based on key-value pairs.
 * filterKeys - Filters the map based only on the keys.
 * filterValues - Filters the map based only on the values.
 * flatMap - Flattens a map into a sequence of entries and applies a transformation.
 */

fun main() {
    // Example: filter (Filter entries based on key-value pairs)
    val sampleMap = mapOf("name" to "Alice", "age" to 25, "city" to "Vancouver", "profession" to "Engineer")
    val filteredMap = sampleMap.filter { (key, value) -> key.startsWith("c") || value == "Alice" }
    println("Filtered map with filter (based on key-value pairs): $filteredMap")

    // Example: filterKeys (Filter only the keys)
    val filteredKeysMap = sampleMap.filterKeys { key -> key.length > 3 }
    println("Filtered map with filterKeys (keys longer than 3 chars): $filteredKeysMap")

    // Example: filterValues (Filter only the values)
    val filteredValuesMap = sampleMap.filterValues { value -> value is String && value.startsWith("E") }
    println("Filtered map with filterValues (values starting with 'E'): $filteredValuesMap")

    // Example: flatMap (Flatten a map into a sequence of entries)
    val flatMappedEntries = sampleMap.flatMap { (key, value) ->
        listOf("$key:$value", "$key-length:${key.length}", "$value-length:${value.toString().length}")
    }
    println("FlatMapped entries from the map: $flatMappedEntries")

    println("\n------\n")

    anotherFilteringTransformingExample()
}

// Another example
fun anotherFilteringTransformingExample() {
    val personMap = mutableMapOf("firstName" to "John", "lastName" to "Doe", "age" to 28, "city" to "Toronto")

    // filter: only keep entries where the key starts with 'f' or the value is 28
    val filteredPersonMap = personMap.filter { (key, value) -> key.startsWith("f") || value == 28 }
    println("Filtered personMap (filter): $filteredPersonMap")

    // filterKeys: keep keys that are 3 or fewer characters long
    val shortKeyMap = personMap.filterKeys { key -> key.length <= 3 }
    println("Filtered personMap (filterKeys): $shortKeyMap")

    // filterValues: only keep values that are strings
    val stringValuesMap = personMap.filterValues { value -> value is String }
    println("Filtered personMap (filterValues): $stringValuesMap")

    // flatMap: generate multiple representations of each key-value pair
    val flatMappedPersonEntries = personMap.flatMap { (key, value) ->
        listOf("$key -> $value", "$key has length ${key.length}", "Value is ${value.toString().length} characters long")
    }
    println("FlatMapped personMap: $flatMappedPersonEntries")
}
