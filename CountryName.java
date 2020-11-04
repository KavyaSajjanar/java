public class CountryName{
   public static void main(String[] names)
   {
	   
	   System.out.println("JVM invoked main");
	   
	   
	   for(int trip=0;trip<names.length;trip++)
	   {
		   System.out.println("Index value "+trip);
		   String countryNameDisplay=names[trip];
		   System.out.println("Country name "+countryNameDisplay);
	   }
	   
	   
	   System.out.println("EXIT  :: main");
	   
   }

}
