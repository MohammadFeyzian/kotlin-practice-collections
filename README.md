# Kotlin Practice Core

## Collections

### Transformation Functions:

- **map** – Transform each element.
- flatMap – Flatten and transform collections.
- filter – Filter elements based on a condition.
- filterNot – Filter elements that don't meet a condition.
- filterNotNull – Filter out null values.
- mapNotNull – Transform non-null elements, remove nulls.
- distinct – Remove duplicate elements.
- sortedBy – Sort by a specific property.
- sortedDescending – Sort in descending order.
- sortedWith
- sortedWithDescending

### Aggregation & Reduction:
- reduce – Combine elements into a single result.
- fold – Accumulate a value starting with an initial value.
- sumOf – Sum by a specific property.
- maxBy (maxOf) – Find the element with the max value by a property.
- minBy (minOf) – Find the element with the min value by a property.
- average – Calculate the average of numerical values.

### Element Access:
- getOrNull – Safely get an element by index.
- first, firstOrNull – Get the first element or throw an exception.
- last, lastOrNull – Get the last element or throw an exception.
- find, findLast – Find the first element matching a condition.
- elementAtOrNull, elementAtOrElse – Get an element by index safely (return null if out of bounds).

### Partitioning & Grouping:
- partition – Split collection into two based on a predicate.
- groupBy – Group elements by a key.

### Checking Conditions:
- all – Check if all elements match a condition.
- any – Check if any element matches a condition.
- none – Check if no elements match a condition.
- contains – Check if a specific element is in the collection.

### Set Operations:
- union – Combine two collections without duplicates.
- intersect – Get common elements between two collections.
- subtract – Get elements in one collection but not in another.

### Creation & Conversion:
- toList – Convert to a list.
- toSet – Convert to a set.
- toMap – Convert a collection to a map.
- associate, associateWith, associateBy – Convert a collection to a map by a property.
- zip – Combine two collections into pairs.
- unzip – Separate a collection of pairs into two collections.
- plus – Add elements or another collection.
- minus – Remove elements or another collection.

### Slicing & Windowing:
- take – Take the first N elements.
- drop – Skip the first N elements.
- chunked – Split a collection into chunks.
- windowed – Create a sliding window of elements.

### Iteration:
- forEach – Iterate over each element.
- onEach – Perform an operation on each element and return the collection.
- iterator – Get an iterator for the collection.

### Others:
- flatten – Flatten nested collections into a single collection.
- zipWithNext – Create pairs of consecutive elements.
- shuffled – Return a shuffled version of the collection.
- random – Return a random element from the collection.




In progress...