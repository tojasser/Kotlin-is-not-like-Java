val randomInt = Random().nextInt(4) // 0..3

//basic syntax
when(randomInt) {
    0 -> print("Empty")
    1 -> print(randomInt)
    2, 3 -> print(randomInt+1)
    else ->
            throw IllegalArgumentException("$randomInt is out of range")
}

//when also is expression
val msg = when(randomInt) {
    0 -> "Empty"
    1 -> "$randomInt"
    2, 3 -> "${randomInt + 1}"
    else ->
        throw IllegalArgumentException("$randomInt is out of range")
}

fun square(number:Any) {
    //when also can be used to check a type of variable
    val squareNumber = when(number) {
        is Int -> number * 2
        is Float -> number * 2
        is Double -> number * 2
        else ->
                throw IllegalArgumentException("$number value isn't numeric")
    }

    print(squareNumber)
}
