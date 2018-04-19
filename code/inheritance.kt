package kotlin

// - Java’s classes and methods are open by default, Kotlin’s are final by default, So you can't inherit it
// - If you want to allow the creation of subclasses of a class, you need to mark the class with the open modifier
// - You need to add the open modifier to every property or method that can be overridden
// - In Kotlin, as in Java, you may declare a class abstract, and this class can’t be instantiated
// - Abstract members are always open, so you don’t need to use an explicit open modifier
abstract class Person(val id: Int, open var name: String?){
    abstract fun getInfo(): String // Abstract function: it doesn’t have an implementation and must be overridden in subclasses.
    open fun printInfo() {} // Non-abstract functions in abstract classes aren’t open by default but can be marked as open.
    fun doNothing() {} // Non-abstract functions
}
//Kotlin uses the colon after the class name to replace both the extends and implements keywords used in Java.
class Student(score:Int,id_: Int,name_: String?): Person(id_,name_) {
    // - The override modifier, similar to the @Override annotation in Java, is used to mark methods and properties
    // that override those from the superclass or interface. Unlike Java, using the override modifier
    // is mandatory in Kotlin. This saves you from accidentally overriding a
    // method if it’s added after you wrote your implementation; your code won’t compile
    // unless you explicitly mark the method as override or rename it.
    override fun getInfo(): String {
        return "Student id is $id, name is $name"
    }
}

class Teacher(score:Int,id_: Int,name_: String?): Person(id_, name_){
    override var name: String?
        get() = super.name
        set(value) {
           name = if (value != "Aziz2") value else "Aziz"
        }

    override fun getInfo(): String {
        return "Teacher id is $id, name is $name"
    }
}
