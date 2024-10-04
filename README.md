# Kotlin Practice Core

## Part 1: Collections - List

### 01. Transformation Functions:

- **map** – Transform each element.
- **flatMap** – Flatten and transform collections.
- **filter** – Filter elements based on a condition.
- **filterNot** – Filter elements that don't meet a condition.
- **filterNotNull** – Filter out null values.
- **mapNotNull** – Transform non-null elements, remove nulls.
- **distinct** – Remove duplicate elements.
- **sortedBy** – Sort by a specific property.
- **sortedDescending** – Sort in descending order.
- **sortedWith**
- **sortedWithDescending**

### 02. Aggregation & Reduction:
- **reduce** – Combine elements into a single result.
- **fold** – Accumulate a value starting with an initial value.
- **sumOf** – Sum by a specific property.
- **maxBy** (**maxOf**) – Find the element with the max value by a property.
- **minBy** (**minOf**) – Find the element with the min value by a property.
- **average** – Calculate the average of numerical values.

### 03. Element Access:
- **getOrNull** – Safely get an element by index.
- **first**, **firstOrNull** – Get the first element or throw an exception.
- **last**, **lastOrNull** – Get the last element or throw an exception.
- **find**, **findLast** – Find the first element matching a condition.
- **elementAtOrNull**, **elementAtOrElse** – Get an element by index safely (return null if out of bounds).

### 04. Partitioning & Grouping:
- **partition** – Split collection into two based on a predicate.
- **groupBy** – Group elements by a key.

### 05. Checking Conditions:
- **all** – Check if all elements match a condition.
- **any** – Check if any element matches a condition.
- **none** – Check if no elements match a condition.
- **contains** – Check if a specific element is in the collection.

### 06. Set Operations:
- **union** – Combine two collections without duplicates.
- **intersect** – Get common elements between two collections.
- **subtract** – Get elements in one collection but not in another.

### 07. Creation & Conversion:
- **toList** – Convert to a list.
- **toSet** – Convert to a set.
- **toMap** – Convert a collection to a map.
- **associate**, associateWith, associateBy – Convert a collection to a map by a property.
- **zip** – Combine two collections into pairs.
- **unzip** – Separate a collection of pairs into two collections.
- **plus** – Add elements or another collection.
- **minus** – Remove elements or another collection.

### 08. Slicing & Windowing:
- **take** – Take the first N elements.
- **drop** – Skip the first N elements.
- **chunked** – Split a collection into chunks.
- **windowed** – Create a sliding window of elements.

### 09. Iteration:
- **forEach** – Iterate over each element.
- **onEach** – Perform an operation on each element and return the collection.
- **iterator** – Get an iterator for the collection.

### 10. Others:
- **flatten** – Flatten nested collections into a single collection.
- **zipWithNext** – Create pairs of consecutive elements.
- **shuffled** – Return a shuffled version of the collection.
- **random** – Return a random element from the collection.
- **orEmpty** – Return an empty list if the collection is null. 
- **requireNoNulls** – Ensure no null elements, throw an exception otherwise.
- **isEmpty** – Check if the collection is empty. 
- **isNotEmpty** – Check if the collection is not empty. 
- **count** – Count the elements in a collection.

## Part 2: Collections - Map

### 11. Map Creation & Modification
- **mapOf** – Create a read-only Map.
- **mutableMapOf** – Create a mutable Map.
- **put** – Add or replace a key-value pair in a mutable map.
- **putAll** – Add all key-value pairs from another map to the current map.
- **remove** – Remove an entry by its key.

### 12. Retrieving Data
- **get** – Get a value by its key.
- **getOrDefault** – Get a value by key, or return a default if the key is missing.
- **getOrElse** – Get a value or compute a default value if the key is absent.
- **getValue** – Get the value of the specified key or throw an exception if absent.

### 13. Iteration
- **forEach** – Iterate through key-value pairs.
- **mapValues** – Transform all values while keeping the keys.
- **mapKeys** – Transform all keys while keeping the values.

### 14. Filtering and Transforming
- **filter** – Filter entries based on key-value pairs.
- **filterKeys** – Filter only the keys.
- **filterValues** – Filter only the values.
- **flatMap** – Flatten a map into a sequence of entries.

### 15. Checking & Finding Entries
- **containsKey** – Check if the map contains a key.
- **containsValue** – Check if the map contains a value.
- **any** – Check if any entry satisfies a condition.
- **all** – Check if all entries satisfy a condition.
- **none** – Check if no entries satisfy a condition.
- **firstNotNullOfOrNull** - Finds the first entry that matches a given condition or null.

### 16. Other Map Utilities
- **keys** – Get a Set of all keys in the map.
- **values** – Get a Collection of all values.
- **entries** – Get a Set of map entries (key-value pairs).
- **plus** – Merge two maps.
- **minus** – Remove a key or multiple keys from a map.
- **MutableMap**: plusAssign, minusAssign



In progress...