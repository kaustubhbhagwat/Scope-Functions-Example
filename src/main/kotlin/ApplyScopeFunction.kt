fun main() {

    /** Scope function 'with'
    Property 1: Refer to the context of the object by using 'this'
    Property 2: Return value is the context object
     */
    val person = Person1().apply {
        name = "Kaustubh"
        age = 30
    }
    println(person.name + person.age)

}

private class  Person1{
    var name: String =""
    var age: Int = 0
}