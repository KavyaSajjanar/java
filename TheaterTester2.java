public class TheaterTester2{


public static void main(String[] photos)
{

System.out.println("invoked main, doing switch and enum");
String name="EVEREST";
String name="PVR";
Theater theaterName=Theater.valueOf(name);

TheaterFinder.lowestAndBestUsingEnum(theaterName);

System.out.println("EXIT :: main, doing switch and enum");
}

}
