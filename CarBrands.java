public class CarBrands{
	public static String[] putbrands(){
		System.out.println("invoked by main");
		
		String[] carBrands={"maruti","sujuki","audi","swift","lamburgini"};
		
		System.out.println("brands size is:  "+carBrands.length);
		
		for(int brands=0;brands<carBrands.length;brands++)
		{
			System.out.println("Brands count "+brands);
			String message=carBrands[brands];
			System.out.println("Car Brand "+ message);
		}
	  	return carBrands; 
	}
}
