fun readNumber (reader :BufferedReader): Int?{
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }catch (e :NumberFormatException){
        return null
    }finally {
        reader.close()
    }
}

//try as expression
fun readNumber2 (reader : BufferedReader){
    //try just like if and when in kotlin it can be expression
    val number = try {
        val line = reader.readLine()
        Integer.parseInt(line)
    }catch (e :NumberFormatException){
        return
    }finally {
        reader.close()
    }
}
