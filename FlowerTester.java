public class FlowerTester{
public static void main(String[] colour){
System.out.println("invoked by main");
System.out.println("main method args length"+colour.length);
String leaf="green leaf";
Flower.having(leaf);
Flower.having(leaf,1);

Flower.having(leaf,"best");
System.out.println("Exit main:");
}
}
