// - Functions and properties can be declared directly in a file, not just as members of a class, allowing
// for a more flexible code structure.
fun <T> joinToString(
        collection: Collection<T>,
        separator: String,
        prefix: String,
        postfix: String
):String {
    val result = StringBuilder(prefix)

    for ((index, item) in collection.withIndex()){
        if (index > 0) result.append(separator)
        result.append(item)
    }
    result.append(postfix)

    return result.toString()
}


//Default parameter value
fun <T> joinToStringDefualtParmValue(
        collection: Collection<T>,
        separator: String = ",",
        prefix: String = "",
        postfix: String = ""
): String{
    val result = StringBuilder(prefix)

    for ((index, item) in collection.withIndex()){
        if (index > 0) result.append(separator)
        result.append(item)
    }
    result.append(postfix)

    return result.toString()
}
// - Defining default values for function parameters greatly reduces the need to define overloaded functions, and
// the named-argument syntax makes calls to functions with many parameters much more readable.


//Varargs: functions that accept an arbitrary number of arguments
//like val list = listOf(2, 3, 5, 7, 11)
//it is declared like this fun listOf<T>(vararg values: T): List<T> { ... }
fun args(vararg values: String){
    //Spread operator unpacks the array contents
    val list = listOf("val " ,*values)
}


//What is to means in this example?
val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
// - The word to in this line of code is a method invocation of a special kind, called an infix call.
// - In an infix call, the method name is placed immediately between the target object name and the parameter, with
// no extra separators. The following two calls are equivalent:
//  1.to("one") //Calls the to function in the regular way
//  1 to "one"  //Calls the to function using an infix notation
// - Infix calls can be used with regular methods and extension functions that have ONE required parameter
// - To allow a function to be called using the infix notation, you need to mark it with the infix modifier
// - Infix calls provide a clean syntax for calling operator-like methods with a single argument.

//You can assign a pair of elements to two variables directly
fun destructuring() {
    //destructuring declaration
    val (number, name) = 1 to "one"
    print(number)
    print(name)
}


fun main(args: Array<String>) {
    val list = listOf(1,2,3)
    //Named argument help a lot with readability, lets have example
    //without named arguments
    joinToString(list,";"," ",".")
    //with named arguments
    joinToString(separator = ";", collection = list,prefix = "{", postfix = "}")
    //NOTE: unfortunately you can't use it when you calling method
    //written in java, because storing parameter name in .class files is supported as an optional feature
    // only starting with java 8, and kotlin maintain compatibility with java 6.

    //Default parameter value has a lot of advantages such as avoid overabundance of overloads
    //Common separator used is comma and we can use empty string as prefix and postfix, So we have to pass just the list
    //and absolutely of you want to change them just add their value.
    joinToStringDefualtParmValue(list)
    //or use named argument to specify the parameter you want to change and omit other parameters
    joinToStringDefualtParmValue(list,prefix = "{")
    //NOTE: as you know java doesn't have concept of default value, so when you call any method from java code you
    // have to specify all the parameter values explicitly, If you frequently need it and want to make that easier
    // to use just annotate it with @Jvm-Overloads this instructs the compiler to generate java overloaded methods,
    // omitting each of the parameters one by one, starting from the last.
    // /* java */
    //String joinToString(Collection<T> collection,String separator,String prefix,String postfix)
    //String joinToString(Collection<T> collection,String separator,String prefix)
    //String joinToString(Collection<T> collection,String separator)
    //String joinToString(Collection<T> collection)

}


//Top-level method: In java you have to create any method in a class and this is work nice, but in realty almost every large
// project ends up with a lot of code that doesn't belong to any single class, To find example of your own
// look at your Util class, In Kotlin you can place functions directly at the top of a source file, outside of any class
// such functions are still member of the package and you can import them out of the package if you want like our joinToString
// what about if we want to call it from java file? we have to understand how it works
//my file name is Function So when I import this method from java code it will be like this
// class FunctionKt{
//  public static string joinToString (...){...}
// }
// class is generated by kotlin compiler corresponds to the file name, what a about if I want change the name to
// Utils for example, all what you have to do is using @file:JvmName annotation at the top of the file
//
// @file:JvmName("Utils")
// package kotlin
//...
// now from java just do this
// Utils.joinToString(...)

//Top-level properties: just like method you define it in a file then it exposed to java as accessor
// getter for val, setter and getter for var, If you want public static final like, you should use const
const val UNIX_LINE_SEPARATOR = "\n" // == public static final UNIX_LINE_SEPARATOR = "\n"
