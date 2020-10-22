public class Festival{
public static void main(String[] hold){
System.out.println("main statement");
String[] ministersArray={"BSY","KUMARSWAMI","SIDDRAMAIYA"};
chiefMinisters(ministersArray);
System.out.println("exit main");
}
public static void chiefMinisters(String[] names){
System.out.println("chiefMinisters:" +names);
int size=names.length;
System.out.println(size);
}
}