public class Native{
public static void main(String[] road){
System.out.println("main statement");
String[] statesArray={"Karnataka","Assam","Kerala","Haryan","Rajastan","TamilNadu","Manipur","Delhi","Bihar","Nagaland"};
states(statesArray);
System.out.println("exit main");
}
public static void states(String[] names){
System.out.println("states:"+names);
int size=names.length;
System.out.println(size);

}
}