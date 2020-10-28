public class Wrapper{
public static void main(String[] value){
System.out.println("invoked by main");
System.out.println("String convert to Primitive data type");
String RollNo="85";
byte convertRollNo=Byte.parseByte(RollNo);
System.out.println("converted" +convertRollNo);


String totalLanguage="1232";
short converttotalLanguage=Short.parseShort(totalLanguage);
System.out.println("converted" +converttotalLanguage);


String heightOfPlace="234567";
int convertheightOfPlace=Integer.parseInt(heightOfPlace);
System.out.println("converted" +convertheightOfPlace);


String lightSpeed ="345677899";
long convertlightSpeed=Long.parseLong(lightSpeed);
System.out.println("converted" +convertlightSpeed);


String interestRate="7.5";
float convertinterestRate=Float.parseFloat(interestRate);
System.out.println("converted" +convertinterestRate);


String SineVal="12.34";
double convertSineVal=Double.parseDouble(SineVal);
System.out.println("converted" +convertSineVal);


String tabletIsSweet="false";
boolean converttabletIsSweet=Boolean.parseBoolean(tabletIsSweet);
System.out.println("converted" +converttabletIsSweet);



}
}
