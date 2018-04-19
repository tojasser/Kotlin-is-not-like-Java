package kotlin

class User(val id: Int, val name: String, val address: String) {

    //Normal validation
    fun saveUser(user: User) {
        if (user.name.isEmpty()) {
            throw IllegalArgumentException(
                    "Cannot save user ${user.id}: Name is empty")
        }
        if (user.address.isEmpty()) {
            throw
            IllegalArgumentException(
                    "Cannot save user ${user.id}: Address is empty")
        }
        // Save user to the database }
    }

    //Validation using local function
    fun saveUserLocalFunction(user: User) {
        //declare a function inside a function
        fun validate(user: User, value: String, fieldName: String) {
            if (value.isEmpty()) {
                throw IllegalArgumentException(
                        "Cannot save user ${user.id}: $fieldName is empty")
            }
        }

        //then use the function
        validate(user, user.name, "Name")
        validate (user, user.address, "Address")

        // Save user to the database
    }

    //Enhanced last local function example
    fun saveUserEnhansedLocalFunction(user: User) {
        //local function has access to all function parameters, So, we can remove user argument from validate
        fun validate(value: String, fieldName: String) {
            if (value.isEmpty()) {
                throw IllegalArgumentException(
                        "Cannot save user ${user.id}: $fieldName is empty")
            }
        }

        //then use the function
        validate(user.name, "Name")
        validate (user.address, "Address")

        // Save user to the database
    }

}

//we can improve it by move the validation logic into an extension function of the User class
fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String)
    {
        if (value.isEmpty()) {
        throw IllegalArgumentException(
                "Can't save user $id: empty $fieldName") }
    }
    validate(name, "Name")
    validate(address, "Address")
}
// Then call it like this user.validateBeforeSave()

// - Local functions help you structure your code more cleanly and eliminate duplication.

// NOTE: Extension functions can also be declared as local functions, But is recommend
// don’t using more than one level of nesting.
