public class IphoneTester{
public static void main(String[] bat){
System.out.println("invoked by jvm");
boolean connect=Iphone.call();
System.out.println("return value from call;" +connect);
String sandesha=Iphone.message();
System.out.println("return value from message:" +sandesha);

}
}