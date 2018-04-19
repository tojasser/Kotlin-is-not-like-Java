//like java while and do while
while (1==0){}
do {}while (0==1)

//There is no for(int i = 0 ; i < size ; i++) in kotlin
//instead kotlin use concept of range
//inclusive one
for (i in 1..10){
    //i = 1,2,3,4,5,6,7,8,9,10
}

//downTo from 10 to 0, step n == jump n
for (i in 10 downTo 0 step 2){
    //10,8,6,4,2,0
}

//exclusive one
for (i in 0 until 10){
    //i = 1,2,3,4,5,6,7,8,9
}


fun binaryOfChar(){
  val binaryReps = TreeMap<Char,String>()

  for (c in 'A'..'F'){
    val binary = Integer.toBinaryString(c.toInt())
    binaryReps[c] = binary
    }

  //iterating over map
  for ((letter, binary) in binaryReps){
    //A = 1000001
    println("$letter = $binary")
    }
}
