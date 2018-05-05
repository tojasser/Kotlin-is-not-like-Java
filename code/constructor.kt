class Student private constructor(firstName: String)
// If the primary constructor does not have any annotations or visibility modifiers, the constructor keyword can be omitted.


class Student(var score:Int, var id: Int,name: String){
    init {
        print("Hi, my name is $name, ")
    }

    init {
        print("and I'm $id years old")
    }
    // What constructor and init?
    // constructor keyword begins the declaration of a primary or secondary constructor.
    // The primary constructor cannot contain any code. Initialization code can be placed in initializer blocks, which
    // are prefixed with the init keyword.
    // During an instance initialization, the initializer blocks are executed in the same
    // order as they appear in the class body, interleaved with the property initializers:
    // So the result Hi, my name is $name, and I'm $id years old
}


// The class can also declare secondary constructors, which are prefixed with constructor
// Each secondary constructor needs to delegate to the primary constructor
// val ali = Student(12,"ali")
// or val ali = Student(20,12,"ali") for second constructor
class Student (var id: Int,name: String){
    // var, var in second constructor parameter is not allowed
    constructor(score:Int,id: Int,name: String): this(id, name) {
            print("$id: $name = $score")
    }
}


// val ali = Student() if you send nothing default value is 20 and ali
// or val ali = Student(12,"Aziz")
// val Aziz = Student(name = "Aziz") //You can explicitly specify names for some or all constructor arguments.
class Student (var id: Int = 20,name: String = "ali")

// If a non-abstract class does not declare any constructors (primary or secondary),
// it will have a generated primary constructor with no arguments
