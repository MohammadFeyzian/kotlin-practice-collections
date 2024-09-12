package collections.map_set

/**
 * containsKey - Checks if the map contains a specific key.
 * containsValue - Checks if the map contains a specific value.
 * any - Checks if any entry satisfies a given condition.
 * all - Checks if all entries satisfy a given condition.
 * none - Checks if no entries satisfy a given condition.
 * firstNotNullOfOrNull - Finds the first entry that matches a given condition or null.
 */

fun main() {
    val sampleMap = mapOf("name" to "Alice", "age" to 25, "city" to "Vancouver", "profession" to "Engineer")

    // Example: containsKey (Check if map contains a specific key)
    println("Map contains key 'age': ${sampleMap.containsKey("age")}")
    println("Map contains key 'salary': ${sampleMap.containsKey("salary")}")

    // Example: containsValue (Check if map contains a specific value)
    println("Map contains value 'Engineer': ${sampleMap.containsValue("Engineer")}")
    println("Map contains value 30: ${sampleMap.containsValue(30)}")

    // Example: any (Check if any entry satisfies a condition)
    val anyStartsWithA = sampleMap.any { (key, value) -> key.startsWith("a") || value.toString().startsWith("A") }
    println("Any entry has a key or value starting with 'A': $anyStartsWithA")

    // Example: all (Check if all entries satisfy a condition)
    val allValuesAreStrings = sampleMap.all { (_, value) -> value is String }
    println("All values in the map are strings: $allValuesAreStrings")

    // Example: none (Check if no entries satisfy a condition)
    val noneHasSalaryKey = sampleMap.none { (key, _) -> key == "salary" }
    println("None of the entries have the key 'salary': $noneHasSalaryKey")

    // Example: find (Find the first entry that matches a condition)
    val firstEntryWithE = sampleMap.firstNotNullOfOrNull { (_, value) -> value.toString().contains("e") }
    println("First entry with a value containing 'e': $firstEntryWithE")

    println("\n------\n")

    anotherCheckingAndFindingExample()
}

// Another example
fun anotherCheckingAndFindingExample() {
    val productMap = mapOf("id" to 101, "name" to "Laptop", "price" to 1500, "category" to "Electronics")

    // containsKey: Check if the map has a specific key
    val hasIdKey = productMap.containsKey("id")
    println("Product map contains 'id' key: $hasIdKey")

    // containsValue: Check if a specific value is present
    val containsElectronics = productMap.containsValue("Electronics")
    println("Product map contains 'Electronics' value: $containsElectronics")

    // any: Check if any key or value satisfies a condition
    val anyHighPrice = productMap.any { (key, value) -> key == "price" && value is Int && value > 1000 }
    println("Any product with a price over 1000: $anyHighPrice")

    // all: Check if all keys or values satisfy a condition
    val allKeysAreStrings = productMap.all { (key, _) -> key is String }
    println("All keys in the product map are strings: $allKeysAreStrings")

    // none: Ensure no entries match a condition
    val noneUnder500 = productMap.none { (_, value) -> value is Int && value < 500 }
    println("No product price under 500: $noneUnder500")

    // find: Find the first entry that matches a specific condition
    val firstExpensiveProduct = productMap.firstNotNullOfOrNull { (key, value) -> key == "price" && value is Int && value > 1000 }
    println("First expensive product entry: $firstExpensiveProduct")
}
