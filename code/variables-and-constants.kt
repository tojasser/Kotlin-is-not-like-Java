// - We start with var or val Keywords to declare variables
// - We can omit a variable type and the compiler analyze the initializer expression
// and uses it's type as the variable type.
var myVariable = 20
myVariable = 21
val myConstant = 20

//or specify the type explicitly if we want
val explicitInt: Int = 12

//if variable doesn't have initializer you have to specify the type explicitly
val userInput: Int
userInput = 12

//there are two keyword to declare a variable:
val myImmutableValue: Int //from value, it's Immutable reference, can't be reassigned after it's initialized like final in java

var myMutableVariable: Int//from variable it's mutable reference, can be changed after it's initialized like non-final in java

//NOTE: by default, you should strive to declare all variables in kotlin with the val keyword, why?
//read more: kotlin in action(p: 21)

//Immutable reference point to mutable, this is valid
val language = arrayListOf("java")
language.add("kotlin")

//var value can be changed but the typed is fixed
//this example lead to type mismatch error
var itIsInteger = 32
itIsInteger = "no value" //type mismatch error
