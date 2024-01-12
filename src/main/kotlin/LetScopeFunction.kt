fun main() {
    /** Scope function 'let'
    Property 1: Refer to the context of the object by using 'it'
    Property 2: Return value is the lambda result
     */

    val name: String = "kaustubh"
    val message = name?.let {
        it.capitalize()
    }
    println("Hello $message")
    println("Length is ${message?.let {it.length }}")

}

