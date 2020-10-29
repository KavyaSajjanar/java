public class Box{
public static void storing(String thing){
System.out.println("invoked storing");
System.out.println("arg thing:" +thing);
}
public static void storing(String thing,String noOfIteams){
System.out.println("invoked storing with two parameters");
System.out.println("String and String");
System.out.println("arg1 thing" +thing);
System.out.println("arg2 noOfIteams" +noOfIteams);
}
public static void storing(String thing,int noOfIteams){
System.out.println("invoked storing with two parameteres");
System.out.println("String and int");
System.out.println("arg1 thing" +noOfIteams);
System.out.println("arg2 noOfIteams" +noOfIteams);
}
public static void storing (int noOfIteams,String thing){
System.out.println("invoked storing with two parameters");
System.out.println("int and String");
System.out.println("arg1 noOfIteams" +noOfIteams);
System.out.println("arg2 thing" +thing);
}
}
