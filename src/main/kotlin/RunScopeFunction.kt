fun main() {
    /** Scope function 'let'
    Combination of with and let
    Property 1: Refer to the context of the object by using 'this'
    Property 2: Return value is the lambda result
     */

    val person: Person2 = Person2()

    val personDetails = person?.run {
        this.age = 30
        this.name = "Kaustubh"

        println(name)
        println(age)
        age + 5
        "Learning Scope functions"
    }
    println("Currently $personDetails")
}

private class Person2 {
    var name: String? = null
    var age: Int = 30
}
