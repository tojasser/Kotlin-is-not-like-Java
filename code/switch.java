int randomInt = new Random().nextInt(4); // 0..3

switch (randomInt){
    case 0:
        System.out.print("Empty");
    case 1:
        System.out.print(randomInt);
        break;
    case 2:
    case 3:
        System.out.print(randomInt+1);
        break;
    default:
        throw new IllegalArgumentException(randomInt + " is out of range");
  }
