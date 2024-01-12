private class Person {
    var name: String? = null
    var age: Int = 30
}


fun main() {
    /** Scope function 'with'
        Property 1: Refer to the context of the object by using 'this'
        Property 2: Return value is the 'lambda result'
     */

    val person = Person()
   val ageAfter5years = with(person) {
        this.age = 30
        this.name = "Kaustubh"

        println(name)
        println(age)
        age + 5
       "Learning Scope functions"
    }
    println("Currently $ageAfter5years")
}