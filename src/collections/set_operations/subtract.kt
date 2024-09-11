package collections.set_operations

/**
 * subtract - Returns a collection containing the elements of the first collection that are not present in the second collection.
 * This function is useful when you want to remove elements from one collection that are present in another collection.
 **/

fun main(){
    // Example: Subtracting elements of one list from another
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(3, 4, 6)

    // Get elements in list1 that are not in list2
    val difference = list1.subtract(list2)

    println("List 1: $list1")
    println("List 2: $list2")
    println("Elements in List 1 but not in List 2: $difference")

    println("\n------\n")

    anotherSubtractExample()
}

// Another example
fun anotherSubtractExample(){
    // Example: Subtracting elements of one list of strings from another
    val colors1 = listOf("red", "blue", "green", "yellow")
    val colors2 = listOf("blue", "green")

    // Get colors in colors1 that are not in colors2
    val remainingColors = colors1.subtract(colors2)

    println("Colors 1: $colors1")
    println("Colors 2: $colors2")
    println("Colors in Colors 1 but not in Colors 2: $remainingColors")
}
