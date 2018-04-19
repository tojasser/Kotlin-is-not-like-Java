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


// access modifier
// modifiers        Class member            Top-level declaration
// public (default) Visible everywhere      Visible everywhere
// internal         Visible in a module     Visible in a module
// protected        Visible in subclasses   ---
// private          Visible in a class      Visible in a file
