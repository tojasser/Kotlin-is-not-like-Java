class Student(var id: Int, var name: String?,var score:Int){
    //custom setter and getter
    //var <propertyName>[: <PropertyType>] [= <property_initializer>]
    //[<getter>]
    //[<setter>]
    var pass: Boolean
    get() = score >= 60
    set(value) {
        pass = if(value == pass) value else pass
    }
    //The accessor’s visibility by default is the same as the property’s
    //But you can change this by putting a visibility modifier before the get or set keyword
}


//Classes in Kotlin can’t have static members; Java’s static keyword isn’t part of the Kotlin language
//Kotlin relies on package-level functions and object declarations
//In most cases, it’s recommended that you use top-level functions if you don't need access to private class members
class Student private constructor(var name:String, var id:Long){
//If marked an object with a special keyword: companion, you gain the ability to access
// the methods and properties of that object directly through the name of the containing class
    companion object {
        var StudentsNumber :Int = 0
        fun addOne() = ++StudentsNumber
        //It’s an ideal candidate to implement the Factory pattern
        fun create(name: String, id:Long) : Student{
          Student.addOne()
          return Student(name,id)
          }
          //But you may need to work with Java code that requires a member of your class to be static.
          // You can achieve this with the @JvmStatic annotation on the corresponding member
          //@JvmStatic
          //fun create(name: String, id:Long) : Student{..}
    }

    //var  Aziz = Student.create("Aziz",3)
    //print(Student.StudentsNumber)
    // >> 1

    //A companion object is a regular object that is declared in a class. It can be named, implement an
    // interface, or have extension functions or properties
}


//We frequently create classes whose main purpose is to hold data, We name it model or POJO in java
// In Kotlin, this is called a data class and is marked as data
data class Student(var name:String, var id:Long)
//The compiler automatically derives the following members from all properties declared in the primary constructor:
// - equals()/hashCode() pair
// - toString() of the form "User(name=Aziz, id=3)"
// - componentN() functions corresponding to the properties in their order of declaration
//          val (name, id) = Aziz
// - copy() val newAziz = Aziz.copy(id = 4).

// data class requirements
// - The primary constructor needs to have at least one parameter
// - All primary constructor parameters need to be marked as val or var
// - Data classes cannot be abstract, open, sealed or inner



// access modifier
// modifiers        Class member            Top-level declaration
// public (default) Visible everywhere      Visible everywhere
// internal         Visible in a module     Visible in a module
// protected        Visible in subclasses   ---
// private          Visible in a class      Visible in a file
