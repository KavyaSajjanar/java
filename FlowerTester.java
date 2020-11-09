public class FlowerTester
{
	public static void main(String[] names)
	{
		String FlowerName=names[0];
		Flower namevalue=Flower.valueOf(FlowerName);
		System.out.println("Flower name is :" +namevalue); 
	}
}
