while (1==0){}
do {}while (0==1);

List<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);

//enhanced for loop
for (int i : list){
    //i = 1,2
  }

void binaryOfChar(){
  Map<Character,String> binaryReps = new TreeMap<>();
  //original for loop
  for (int c = 127; c < 159; c++){
      binaryReps.put((char)c,Integer.toBinaryString((char)c));
    }

  for (Map.Entry<Character,String> entry : binaryReps.entrySet()){
      System.out.println(entry.getKey() + " = " + entry.getValue());
    }
}
