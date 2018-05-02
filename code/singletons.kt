// Kotlin makes it easy to declare singletons
// This is called an object declaration, and it always has a name following the object keyword
object Singleton {
    // var so you can change it
    var b: Int? = null
}
// Object declaration's initialization is thread-safe
// To refer to the object, we use its name directly:
// Singleton.b = 10
