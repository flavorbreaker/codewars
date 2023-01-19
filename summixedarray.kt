//Title: Sum Mixed Array
//Language: Kotlin
//Description:
    //Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
    //Return your answer as a number.

public class MixedSum {

    /*
    * Assume input will be only of Int or String type
    */
    public fun sum(mixed: List<Any>): Int {
        var total: Int = 0
        var add: Int = 0
        
        mixed.forEach {
            if (it is String) {
               add = it.toInt()
            }
            
            if (it is Int) {
                add = it
            }
            
            total += add
        }
        
        return total
    }
}