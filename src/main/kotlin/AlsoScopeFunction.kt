fun main() {
    /** Scope function 'also'
    Property 1: Refer to the context of the object by using 'it'
    Property 2: Return value is the context object
     */

    val numbersList: MutableList<Int> = mutableListOf(1,2,3)

    val numbers = numbersList.also {
        numbersList.also {
            println("Original list is $it")
            it.clear()
            it.add(5)
            it.add(6)
            it.add(7)
            it.add(8)
            println("Mutated List is $it")
        }
    }

    println(numbers)
}
