// nullity problems are converted from runtime errors into compile-time errors. By supporting nullability as
// part of the type system, the compiler can detect many possible errors during compilation and
// reduce the possibility of having exceptions thrown at runtime.

//Safe call operator: “?.”
fun strLen(s: String) = s.length
// Calling strLen with an argument that may be null isn’t allowed and will be flagged as error at compile time:
// strLen(null)
// ERROR: Null can not be a value of a non-null type String

//If you want to accept null value all what you need is adding ? after the parameter
fun nullableStrLen(s: String?) = s?.length
// What ? means = Type? = type or null
// if you use it you have to check weather it's null or not each time like this s?.first()
// or you can avoid this by you using it under if comparision with null
fun ifNullableStrLen(s: String?){
    if (s != null)
        s.length
}

// ERROR: Type mismatch: inferred type is String? but String was expected
// var x: String? = null
// var y: String = x

// and you can use it like this
// class Employee(val name: String, val manager: Employee?){
// fun managerName(employee: Employee): String? = employee.manager?.name
//}


// Elvis operator: “?:”, or null-coalescing operator
fun getId(sid:String?) = sid ?: "NaN"
// What ?: means = val1 = val or default val

// Elvis with Safe call
fun strLenSafe(s: String?): Int = s?.length ?: 0

// Safe casts: “as?”
var y: Any? = "test nullity"
val x: String? = y as? String // that returns null on failure


// Not-null assertions: “!!”
// it's converts any value to a non-null type
// value!! = value or NullPointerException
fun imSureNotNull(s:String?){
    val notNull = s!!
    print(notNull)
}
// imSureNotNull(null)
// BoOom ... NullPointerException

// When use assertion operator essentially, you’re telling the compiler, “I know the value isn’t null,
// and I’m ready for an exception if it turns out I’m wrong.”
// You may notice that the double exclamation mark looks a bit rude: it’s almost like you’re yelling at the compiler.

// This is intentional. The designers of Kotlin are trying to nudge you toward a better solution
// that doesn’t involve making assertions that can’t be verified by the compiler.
