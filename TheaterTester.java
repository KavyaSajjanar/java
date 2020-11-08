public class TheaterTester{


public static void main(String[] photos)
{

System.out.println("invoked main, doing switch and enum");


TheaterFinder.lowestAndBestUsingEnum(Theater.EVEREST);
TheaterFinder.lowestAndBestUsingEnum(Theater.PVR);


System.out.println("EXIT :: main, doing switch and enum");
}
}