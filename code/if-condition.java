int a = new Random().nextInt();
int b = new Random().nextInt();
String result;

if (a < b)
   result = b + " bigger than " + a;
else
    result = a + " bigger than " + b;

//Ternary operator
result = a < b ? b + " bigger than " + a : a + " bigger than " + b;
