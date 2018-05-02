String x = null;
String y = "Value";
// check nullity
if (x != null){
    y = y + " " + x;
}else {
    x = y;
}

x = null;
// check type
if (x instanceof String) {
    String z = x;
    System.out.print(z.length());
}
