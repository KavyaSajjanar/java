public class Iphone{
public static boolean call(){
System.out.println("invoked call");
boolean connected=false;
return connected;
}
public static String message(){
System.out.println("invoked message");
String msg="good morning";
return msg;
}
public static byte charging(double volts){
System.out.println("volts" +volts);
if(volts>3){
	System.out.println("volts is greater than 3");
	return 100;
	
}	
if(volts<3){
	System.out.println("volts is smaller than 3");
	return 0;
}	
return -1;	
}
}




