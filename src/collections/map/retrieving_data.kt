package collections.map

/**
 * get - Retrieve a value by its key.
 * getOrDefault - Retrieve a value by key, or return a default if the key is missing.
 * getOrElse - Retrieve a value or compute a default value if the key is absent.
 * getValue - Retrieve the value of the specified key or throw an exception if absent.
 */

fun main() {
    // Example: get (Retrieve value by key)
    val map = mapOf("name" to "Alice", "age" to 25, "city" to "Vancouver")
    println("Value for 'name' using get: ${map.get("name")}")  // or map["name"]

    // Example: getOrDefault (Retrieve value or default)
    println("Value for 'profession' (absent) using getOrDefault: ${map.getOrDefault("profession", "Unknown")}")

    // Example: getOrElse (Retrieve value or compute default)
    println("Value for 'profession' using getOrElse: ${map.getOrElse("profession") { "Not Specified" }}")

    // Example: getValue (Retrieve value or throw exception)
    try {
        println("Value for 'age' using getValue: ${map.getValue("age")}")
        println("Value for 'profession' using getValue: ${map.getValue("profession")}") // Will throw an exception
    } catch (e: NoSuchElementException) {
        println("Caught Exception: ${e.message}")
    }

    println("\n------\n")

    anotherRetrievingDataExample()
}

// Another example
fun anotherRetrievingDataExample() {
    val userMap = mutableMapOf("username" to "john_doe", "email" to "john@example.com", "age" to 32)

    // get
    println("Username using get: ${userMap["username"]}")

    // getOrDefault
    val status = userMap.getOrDefault("status", "Inactive")
    println("User status using getOrDefault: $status")

    // getOrElse
    val role = userMap.getOrElse("role") { "Guest" }
    println("User role using getOrElse: $role")

    // getValue with exception handling
    try {
        println("Email using getValue: ${userMap.getValue("email")}")
        println("Status using getValue (missing key): ${userMap.getValue("status")}")
    } catch (e: NoSuchElementException) {
        println("Caught exception in getValue: ${e.message}")
    }
}
