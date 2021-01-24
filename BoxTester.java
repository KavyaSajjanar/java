public class BoxTester{
public static void main(String[] things){
System.out.println("invoked by main");
System.out.println("main method args length"+things.length);
String pins="white";
Box.storing(pins);
Box.storing(pins,3);

Box.storing(pins,"black");
System.out.println("Exit main:");
}
}
