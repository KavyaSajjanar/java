public class Picture{
public static void containing(String diagrams){
System.out.println("invoked containing");
System.out.println("arg poster:" +diagrams);
}
public static void containing(String poster,String toatalBrushes){
System.out.println("invoked containing with two parameters");
System.out.println("String and String");
System.out.println("arg1 poster" +poster);
System.out.println("arg2 toatalBrushes" +toatalBrushes);
}
public static void containing(String poster,int totalBrushes){
System.out.println("invoked containing with two parameteres");
System.out.println("String and int");
System.out.println("arg1 poster" +poster);
System.out.println("arg2  totalBrushes" +totalBrushes);
}
public static void containing(int totalBrushes,String poster){
System.out.println("invoked containing with two parameters");
System.out.println("int and String");
System.out.println("arg1 totalBrushes" +totalBrushes);
System.out.println("arg2 poster" +poster);
}
}
