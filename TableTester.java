public class TableTester{
public static void main(String[] somethings){
System.out.println("invoked by main");
System.out.println("main method args length"+somethings.length);
String book="Comic";
Table.holding(book);
Table.holding(book,2);
Table.holding(book,"pen");
System.out.println("Exit main:");
}
}
