public class Flower{
public static void having(String colour){
System.out.println("invoked having");
System.out.println("arg colour:" +colour);
}
public static void having(String leaf,String toatalBranches){
System.out.println("invoked having with two parameters");
System.out.println("String and String");
System.out.println("arg1 leaf" +leaf);
System.out.println("arg2 toatalBranches" +toatalBranches);
}
public static void having(String leaf,int toatalBranches){
System.out.println("invoked having with two parameteres");
System.out.println("String and int");
System.out.println("arg1 leaf" +leaf);
System.out.println("arg2 toatalBranches" +toatalBranches);
}
public static void having(int toatalBranches,String leaf){
System.out.println("invoked having with two parameters");
System.out.println("int and String");
System.out.println("arg1 toatalBranches" +toatalBranches);
System.out.println("arg2 leaf" +leaf);
}
}
