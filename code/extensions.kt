package kotlin

// Conceptually an extension function is a function that can be called as a member of a class but it's define outside of it.
    //String -> the receiver type
fun String.lastChar(): Char = get(length -1)

fun test (){
    val name = "Aziz"
    //name -> the receiver object
    name.lastChar()

    // - when you define an extension function it does't automatically become available across your entire project instead,
    // it needs to be imported if you call it out of its package, this is helps avoid accidental name conflict.
    // import file-name.method-name
    // import Extension.lastChar

    //  - you can change the name of the class or function using 'as' keyword, it's useful when you
    // have several methods with same name
    // import Extension.lastChar as last
    // name.last()
}


// - extension method don't allow you to break encapsulation, Unlike method defined in the class, method extension
// don't have access to to protected and private members of the class

// - Under the hood, an extension function is a static method that accepts the receiver object as its first argument
// So, When call it from java code just like top-level method, looks like this
// char c = Extension.lastChar("Java");

// - No overriding for extension method, if you have view class parent of button class, and you define view.doSomething()
// you can't use it with button object, the extension method is declared externally So it not part of the class member.

// - if a class has a member function with the same signature as an extension function the member function always
// take precedence

// - Extension functions and properties let you extend the API of any class, including classes defined in external
// libraries, without modifying its source code and with no runtime overhead.
