val a = Random().nextInt()
val b = Random().nextInt()
var result :String

//like java
if (a < b )
    //String template, allow you to refer to local variable in string literal by using $
    //like java ("Hello " + name) BUT more compact and as efficient
    result = "$b bigger than $a"
else
    result = "$a bigger than $b"


// - There is ow ternary operator in kotlin but
// IF in kotlin is expression, it can return a value
result = if (a < b ) "$b bigger than $a" else "$a bigger than $b"

//Or
result = "The biggest number is ${if(a < b) a else b}}"
