public class  PhotographyTester{
public static void main(String[] types){
String phototype="PORTRAIT";
Photography convertedphotoFromString=Photography.valueOf( phototype);
System.out.println( convertedphotoFromString);
Photography [] allphotos=Photography.values();
System.out.println(allphotos.length);
for(int photosInitial=0;photosInitial<allphotos.length;photosInitial++){
System.out.println("index" +photosInitial);
Photography photoValue=allphotos[photosInitial];
System.out.println("photo enum value" +photoValue);
}
}
}