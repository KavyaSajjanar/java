public class PictureTester{
public static void main(String[] diagrams){
System.out.println("invoked by main");
System.out.println("main method args length"+diagrams.length);
String poster="graphic";
Picture.containing(poster);
Picture.containing(poster,1);

Picture.containing(poster,"paint");
System.out.println("Exit main:");
}
}
