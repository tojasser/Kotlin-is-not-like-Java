//To declare an interface use the interface keyword
interface Clickable {
    //abstract method
    // All non-abstract classes implementing the interface need to provide an implementation of this method
    fun click()

    //not-abstract method
    // An interface method can have a default implementation. Unlike Java 8, you don't use the default keyword
    fun showOff() = println("I'm clickable!")
}

//another interface with same Clickables's method name showOff
interface Focusable {
    fun setFocus(b: Boolean) =
            println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!") }
// now if you implement both interfaces in your class the compiler will forces you to provide your own implementation

//Kotlin uses the colon after the class name to replace both the extends and implements keywords used in Java.
class Button : Clickable, Focusable {
    // - The override modifier, similar to the @Override annotation in Java, is used to mark methods and properties
    // that override those from the superclass or interface. Unlike Java, using the override modifier
    // is mandatory in Kotlin. This saves you from accidentally overriding a
    // method if it’s added after you wrote your implementation; your code won’t compile
    // unless you explicitly mark the method as override or rename it.
    override fun click() = println("I was clicked")


    //The class Button must override public open fun showOff() because it inherits many implementations of it.
    override fun showOff() {
        //To invoke an inherited implementation call the implementation that you inherited from supertype
        super.showOff()
        super.showOff()

        //or just one of them like this
        // override fun showOff() = super.showOff()

        //or neither one by just use override and write your implementation
    }
}
